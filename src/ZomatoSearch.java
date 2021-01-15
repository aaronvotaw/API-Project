import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZomatoSearch
{ 	@JsonProperty("results_found")
private
String results_found;
	@JsonProperty("results_start")
	private
	String results_start;
	@JsonProperty("results_shown")
	private
	String results_shown;
	@JsonProperty("restaurants")
	private
	Restaurant[] restaurants;

	public String getResults_found()
	{
		return results_found;
	}

	public void setResults_found(String results_found)
	{
		this.results_found = results_found;
	}

	public String getResults_start()
	{
		return results_start;
	}

	public void setResults_start(String results_start)
	{
		this.results_start = results_start;
	}

	public String getResults_shown()
	{
		return results_shown;
	}

	public void setResults_shown(String results_shown)
	{
		this.results_shown = results_shown;
	}

	public Restaurant[] getRestaurants()
	{
		return restaurants;
	}

	public void setRestaurants(Restaurant[] restaurants)
	{
		this.restaurants = restaurants;
	}
}
