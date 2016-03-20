package coffee;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Drink")
@XmlAccessorType(XmlAccessType.FIELD)
public class Drink extends Item
{
	private List<Extra> extras;

	public List<Extra> getExtras()
	{
		return extras;
	}

	public void setExtras(List<Extra> extras)
	{
		this.extras = extras;
	}
}
