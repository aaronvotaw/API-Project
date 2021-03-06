import com.fasterxml.jackson.annotation.JsonProperty;

public class GeocodeSouthwest
{
	@JsonProperty("lat")
	private String latitude;
	@JsonProperty("lng")
	private String longitude;

	public GeocodeSouthwest()
	{
	}

	public String getLatitude()
	{
		return latitude;
	}

	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}

	public String getLongitude()
	{
		return longitude;
	}

	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
	}
}
