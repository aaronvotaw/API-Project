import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodeResult
{
	@JsonIgnore
	private List<AddressComponent> address_components;
	private List<GeocodeObject> results;
	private String status;
	public GeocodeResult() {
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<GeocodeObject> getResults() {
		return results;
	}
	public void setResults(List<GeocodeObject> results) {
		this.results = results;
	}

	public List<AddressComponent> getAddress_components()
	{
		return address_components;
	}

	public void setAddress_components(List<AddressComponent> address_components)
	{
		this.address_components = address_components;
	}
}
