import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationNode
{	LocationNode(){}
	@JsonProperty("location_suggestions")
	private
	LocationSuggestion[] location_suggestions;
	@JsonProperty("status")
	private
	String status;
	@JsonProperty("has_more")
	private
	String has_more;
	@JsonProperty("has_total")
	private
	String has_total;
	@JsonProperty("user_has_addresses")
	private
	String user_has_addresses;
	public LocationSuggestion[] getLocSuggestions(){
		return getLocation_suggestions();
		}
	public  void setLocSuggestions(LocationSuggestion[] location_suggestions){
		this.setLocation_suggestions(location_suggestions);
		}
	public String getStatus(){
		return status;
		}
	public void setStatus(String status){
		this.status = status;
		}
	public String getHasMore(){
		return getHas_more();
		}
	public void setHasMore(String has_more){
		this.setHas_more(has_more);
		}
	public String getHasTotal(){
		return getHas_total();
		}
	public void setHasTotal(String has_total){
		this.setHas_total(has_total);
		}
	public String getUserHasAdresses(){
		return getUser_has_addresses();
		}
	public void setUserHasAddresses(String user_has_addresses){
		this.setUser_has_addresses(user_has_addresses);
		}

	public LocationSuggestion[] getLocation_suggestions()
	{
		return location_suggestions;
	}

	public void setLocation_suggestions(LocationSuggestion[] location_suggestions)
	{
		this.location_suggestions = location_suggestions;
	}

	public String getHas_more()
	{
		return has_more;
	}

	public void setHas_more(String has_more)
	{
		this.has_more = has_more;
	}

	public String getHas_total()
	{
		return has_total;
	}

	public void setHas_total(String has_total)
	{
		this.has_total = has_total;
	}

	public String getUser_has_addresses()
	{
		return user_has_addresses;
	}

	public void setUser_has_addresses(String user_has_addresses)
	{
		this.user_has_addresses = user_has_addresses;
	}
}
