package coffee;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order
{
	private String orderId;
	private List<Drink> drinks;
	private boolean isReady = false;
	
	public String getOrderId()
	{
		return orderId;
	}
	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}
	public List<Drink> getDrinks()
	{
		return drinks;
	}
	public void setDrinks(List<Drink> drinks)
	{
		this.drinks = drinks;
	}
	public boolean isReady()
	{
		return isReady;
	}
	public void setReady(boolean isReady)
	{
		this.isReady = isReady;
	}
}
