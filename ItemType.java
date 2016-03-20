package coffee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ItemType")
@XmlAccessorType(XmlAccessType.FIELD)
public enum ItemType
{
	COFFEE,
	TEA,
	EXTRA
}
