package coffee;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/Item")
public class ItemManager
{
	@Context
    UriInfo uriInfo;
	
	@PermitAll
	@GET
	@Path("/Menu")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> getMenu()
	{ 
		return new ArrayList<Item>();
	}
	
	@RolesAllowed("BARISTA")
	@PUT
	@Path("/Menu")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMenuItem(Item theItem)
	{ 
	    return Response.status(201).entity(new ArrayList<Item>()).build(); 
	}
	
	@PermitAll
	@GET
	@Path("/Order/{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrder(@PathParam("orderId") String orderId)
	{
		if (orderId == null)
		{
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		else if (DataAccess.FindOrder(orderId) == null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		
		Order theOrder = new Order();
		theOrder.setReady(true);
		return theOrder;
	}
	
	@RolesAllowed("BARISTA")
	@GET
	@Path("/Order/AllOrders/{pageNumber}/{recordSetId}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderPage getAllOrders(@PathParam("pageNumber") int pageNumber, @PathParam("recordSetId") String recordSetId)
	{
		return new OrderPage();
	}
	
	@PermitAll
	@POST
	@Path("/Order")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrder(Order theOrder)
	{
		// Create unique order id
		String orderId = new String(java.util.UUID.randomUUID().toString());
		theOrder.setOrderId(orderId);
		
		// Fire and forget the process to create: "createstuffAsync()"
		// so that we can return immediately
		
		return Response.accepted().entity(theOrder).build();
	}
	
	@RolesAllowed("BARISTA")
	@PUT
	@Path("/Order")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateOrder(Order theOrder)
	{
	    return Response.ok().build(); 
	}
}
