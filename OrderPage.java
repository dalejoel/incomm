package coffee;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Item")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderPage
{
	private List<Order> orders;
	private int currentPage;
	private int totalPages;
	private String recordSetId;
	
	public List<Order> getOrders()
	{
		return orders;
	}
	public void setOrders(List<Order> orders)
	{
		this.orders = orders;
	}
	public int getCurrentPage()
	{
		return currentPage;
	}
	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}
	public int getTotalPages()
	{
		return totalPages;
	}
	public void setTotalPages(int totalPages)
	{
		this.totalPages = totalPages;
	}
	public String getRecordSetId()
	{
		return recordSetId;
	}
	public void setRecordSetId(String recordSetId)
	{
		this.recordSetId = recordSetId;
	}
}
