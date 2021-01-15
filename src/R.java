import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class R
{
	@JsonProperty("res_id")
	private
	String res_id;
	@JsonProperty("is_grocery_store")
	private
	String is_grocery_store;
	@JsonProperty
	private
	MenuStatus has_menu_status;

	public String getRes_id()
	{
		return res_id;
	}

	public void setRes_id(String res_id)
	{
		this.res_id = res_id;
	}

	public String getIs_grocery_store()
	{
		return is_grocery_store;
	}

	public void setIs_grocery_store(String is_grocery_store)
	{
		this.is_grocery_store = is_grocery_store;
	}

	public MenuStatus getHas_menu_status()
	{
		return has_menu_status;
	}

	public void setHas_menu_status(MenuStatus has_menu_status)
	{
		this.has_menu_status = has_menu_status;
	}

	public class MenuStatus{
		@JsonProperty("delivery")
		String delivery;
		@JsonProperty("takeaway")
		String takeaway;

		public String getDelivery()
		{
			return delivery;
		}

		public void setDelivery(String delivery)
		{
			this.delivery = delivery;
		}

		public String getTakeaway(){
			return takeaway;
		}

		public void setTakeaway(String takeaway)
		{
			this.takeaway = takeaway;
		}
	}
}
