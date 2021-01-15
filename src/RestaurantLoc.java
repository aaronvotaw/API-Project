import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantLoc
{
	@JsonProperty("address")
	private
	String address;
	@JsonIgnore
	private
	String locality;
	@JsonIgnore
	private
	String city;
	@JsonIgnore
	private
	String city_id;
	@JsonIgnore
	private
	String latitude;
	@JsonIgnore
	private
	String longitude;
	@JsonIgnore
	private
	String zipcode;
	@JsonIgnore
	private
	String country_id;
	@JsonIgnore
	private
	String locality_verbose;

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getLocality()
	{
		return locality;
	}

	public void setLocality(String locality)
	{
		this.locality = locality;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCity_id()
	{
		return city_id;
	}

	public void setCity_id(String city_id)
	{
		this.city_id = city_id;
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

	public String getZipcode()
	{
		return zipcode;
	}

	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

	public String getCountry_id()
	{
		return country_id;
	}

	public void setCountry_id(String country_id)
	{
		this.country_id = country_id;
	}

	public String getLocality_verbose()
	{
		return locality_verbose;
	}

	public void setLocality_verbose(String locality_verbose)
	{
		this.locality_verbose = locality_verbose;
	}
}
