import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationSuggestion
{
	@JsonProperty("entity_type")
	private
	String entity_type;
	@JsonProperty("entity_id")
	private
	String entity_id;
	@JsonProperty("title")
	private
	String title;
	@JsonProperty("latitude")
	private
	String latitude;
	@JsonProperty("longitude")
	private
	String longitude;
	@JsonProperty("city_id")
	private
	String city_id;
	@JsonProperty("city_name")
	private
	String city_name;
	@JsonProperty("country_id")
	private
	String country_id;
	@JsonProperty("country_name")
	private
	String country_name;

	public String getEntityType(){
		return getEntity_type();
		}
	public void setEntityType(String entity_type){
		this.setEntity_type(entity_type);
		}
	public String getEntityID(){
		return getEntity_id();
		}
	public void setEntityID(String entity_id){
		this.setEntity_id(entity_id);
		}
	public String getTitle(){
		return title;
		}
	public void setTitle(String title){
		this.title = title;
		}
	public String getLatitude(){
		return latitude;
		}
	public void setLatitude(String latitude){
		this.latitude = latitude;
		}
	public String getLongitude(){
		return longitude;
		}
	public void setLongitude(String longitude){
		this.longitude = longitude;
		}
	public String getCityID(){
		return getCity_id();
		}
	public void setCityID(String city_id){
		this.setCity_id(city_id);
		}
	public String getCityName(){
		return getCity_name();
		}
	public void setCityName(String city_name){
		this.setCity_name(city_name);
		}
	public String getCountryID(){
		return getCountry_id();
		}
	public void setCountryID(String country_id){
		this.setCountry_id(country_id);
		}
	public String getCountryName(){
		return getCountry_name();
		}
	public void setCountryName(String country_name){
		this.setCountry_name(country_name);
		}

	public String getEntity_type()
	{
		return entity_type;
	}

	public void setEntity_type(String entity_type)
	{
		this.entity_type = entity_type;
	}

	public String getEntity_id()
	{
		return entity_id;
	}

	public void setEntity_id(String entity_id)
	{
		this.entity_id = entity_id;
	}

	public String getCity_id()
	{
		return city_id;
	}

	public void setCity_id(String city_id)
	{
		this.city_id = city_id;
	}

	public String getCity_name()
	{
		return city_name;
	}

	public void setCity_name(String city_name)
	{
		this.city_name = city_name;
	}

	public String getCountry_id()
	{
		return country_id;
	}

	public void setCountry_id(String country_id)
	{
		this.country_id = country_id;
	}

	public String getCountry_name()
	{
		return country_name;
	}

	public void setCountry_name(String country_name)
	{
		this.country_name = country_name;
	}
}
