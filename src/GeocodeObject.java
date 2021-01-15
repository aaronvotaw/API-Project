import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodeObject
{
	@JsonProperty("place_id")
	private
	String placeId;
	@JsonIgnore
	private
	List<AddressComponent> addressComponents;
	@JsonProperty("formatted_address")
	private
	String formattedAddress;
	@JsonProperty("geometry")
	private
	GeocodeGeometry geometry;
	@JsonIgnore
	private List<AddressComponent> address_components;
	@JsonIgnore
	private List<String> types;

	public GeocodeObject() {
	}
	public List<AddressComponent> getAddressComponents() {
		return addressComponents;
	}
	public void setAddressComponents(List<AddressComponent> addressComponents) {
		this.addressComponents = addressComponents;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public GeocodeGeometry getGeometry() {
		return geometry;
	}
	public void setGeometry(GeocodeGeometry geometry) {
		this.geometry = geometry;
	}

	public List<AddressComponent> getAddress_components()
	{
		return address_components;
	}

	public void setAddress_components(List<AddressComponent> address_components)
	{
		this.address_components = address_components;
	}

	public List<String> getTypes()
	{
		return types;
	}

	public void setTypes(List<String> types)
	{
		this.types = types;
	}
}



