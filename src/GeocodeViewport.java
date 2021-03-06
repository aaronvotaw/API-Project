import com.fasterxml.jackson.annotation.JsonProperty;

public class GeocodeViewport
{

	@JsonProperty("northeast")
	private GeocodeNortheast northeast;
	@JsonProperty("southwest")
	private GeocodeSouthwest southwest;

	public GeocodeViewport()
	{
	}

	public GeocodeNortheast getNortheast()
	{
		return northeast;
	}

	public void setNortheast(GeocodeNortheast northeast)
	{
		this.northeast = northeast;
	}

	public GeocodeSouthwest getSouthwest()
	{
		return southwest;
	}

	public void setSouthwest(GeocodeSouthwest southwest)
	{
		this.southwest = southwest;
	}
}
