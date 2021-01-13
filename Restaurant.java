import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant
{ @JsonProperty("restaurant")
private
Restaurant2 restaurant;

	public Restaurant2 getRestaurant()
	{
		return restaurant;
	}

	public void setRestaurant(Restaurant2 restaurant)
	{
		this.restaurant = restaurant;
	}
}
