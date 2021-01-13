import com.fasterxml.jackson.annotation.JsonProperty;

public class GeocodeGeometry
{
	@JsonProperty("location")
	private
	GeocodeLocation geocodeLocation;

	@JsonProperty("bounds")
	private
	GeocodeBounds geocodeBounds;

	@JsonProperty("location_type")
	private
	String location_type;

	@JsonProperty("viewport")
	private
	GeocodeViewport geocodeViewport;

	public GeocodeGeometry()
	{
	}

	public GeocodeLocation getGeocodeLocation()
	{
		return geocodeLocation;
	}

	public void setGeocodeLocation(GeocodeLocation geocodeLocation)
	{
		this.geocodeLocation = geocodeLocation;
	}

	public GeocodeBounds getGeocodeBounds()
	{
		return geocodeBounds;
	}

	public void setGeocodeBounds(GeocodeBounds geocodeBounds)
	{
		this.geocodeBounds = geocodeBounds;
	}

	public String getLocation_type()
	{
		return location_type;
	}

	public void setLocation_type(String location_type)
	{
		this.location_type = location_type;
	}

	public GeocodeViewport getGeocodeViewport()
	{
		return geocodeViewport;
	}

	public void setGeocodeViewport(GeocodeViewport geocodeViewport)
	{
		this.geocodeViewport = geocodeViewport;
	}
}
