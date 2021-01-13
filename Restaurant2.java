import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant2
{
	@JsonProperty("R")
	private
	R R;
	@JsonProperty("apikey")
	private
	String apikey;
	@JsonProperty("id")
	private
	String id;
	@JsonProperty("name")
	private
	String name;
	@JsonProperty("url")
	private
	String url;
	@JsonProperty("location")
	private
	RestaurantLoc location;
	@JsonIgnore
	private
	String switch_to_order_menu;
	@JsonIgnore
	private
	String cuisines;
	@JsonIgnore
	private
	String timings;
	@JsonIgnore
	private
	String average_cost_for_two;
	@JsonIgnore
	private
	String price_range;
	@JsonIgnore
	private
	String currency;
	@JsonIgnore
	private
	String[] highlights;
	@JsonIgnore
	private
	String[] offers;
	@JsonIgnore
	private
	String opentable_support;
	@JsonIgnore
	private
	String is_zomato_book_res;
	@JsonIgnore
	private
	String mezzo_provider;
	@JsonIgnore
	private
	String is_book_form_web_view;
	@JsonIgnore
	private
	String book_form_web_view_url;
	@JsonIgnore
	private
	String book_again_url;
	@JsonIgnore
	private
	String thumb;
	@JsonIgnore
	private
	Object user_rating;
	@JsonIgnore
	private
	String all_reviews_count;
	@JsonIgnore
	private
	String photos_url;
	@JsonIgnore
	private
	String photo_count;
	@JsonIgnore
	private
	String menu_url;
	@JsonIgnore
	private
	String featured_image;
	@JsonIgnore
	private
	String medio_provider;
	@JsonIgnore
	private
	String has_online_delivery;
	@JsonIgnore
	private
	String is_delivering_now;
	@JsonIgnore
	private
	String store_type;
	@JsonIgnore
	private
	String include_bogo_offers;
	@JsonIgnore
	private
	String deeplink;
	@JsonIgnore
	private
	String is_table_reservation_supported;
	@JsonIgnore
	private
	String has_table_booking;
	@JsonIgnore
	private
	String events_url;
	@JsonProperty("phone_numbers")
	private
	String phone_numbers;
	@JsonIgnore
	private
	Object all_reviews;
	@JsonIgnore
	private
	String[] establishment;
	@JsonIgnore
	private
	String[] establishment_types;

	public String getPhone_numbers()
	{
		return phone_numbers;
	}

	public void setPhone_numbers(String phone_numbers)
	{
		this.phone_numbers = phone_numbers;
	}

	public R getR()
	{
		return R;
	}

	public void setR(R r)
	{
		R = r;
	}

	public void setLocation(RestaurantLoc location)
	{
		this.location = location;
	}

	public RestaurantLoc getLocation()
	{
		return location;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getApikey()
	{
		return apikey;
	}

	public void setApikey(String apikey)
	{
		this.apikey = apikey;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getSwitch_to_order_menu()
	{
		return switch_to_order_menu;
	}

	public void setSwitch_to_order_menu(String switch_to_order_menu)
	{
		this.switch_to_order_menu = switch_to_order_menu;
	}

	public String getCuisines()
	{
		return cuisines;
	}

	public void setCuisines(String cuisines)
	{
		this.cuisines = cuisines;
	}

	public String getTimings()
	{
		return timings;
	}

	public void setTimings(String timings)
	{
		this.timings = timings;
	}

	public String getAverage_cost_for_two()
	{
		return average_cost_for_two;
	}

	public void setAverage_cost_for_two(String average_cost_for_two)
	{
		this.average_cost_for_two = average_cost_for_two;
	}

	public String getPrice_range()
	{
		return price_range;
	}

	public void setPrice_range(String price_range)
	{
		this.price_range = price_range;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public String[] getHighlights()
	{
		return highlights;
	}

	public void setHighlights(String[] highlights)
	{
		this.highlights = highlights;
	}

	public String[] getOffers()
	{
		return offers;
	}

	public void setOffers(String[] offers)
	{
		this.offers = offers;
	}

	public String getOpentable_support()
	{
		return opentable_support;
	}

	public void setOpentable_support(String opentable_support)
	{
		this.opentable_support = opentable_support;
	}

	public String getIs_zomato_book_res()
	{
		return is_zomato_book_res;
	}

	public void setIs_zomato_book_res(String is_zomato_book_res)
	{
		this.is_zomato_book_res = is_zomato_book_res;
	}

	public String getMezzo_provider()
	{
		return mezzo_provider;
	}

	public void setMezzo_provider(String mezzo_provider)
	{
		this.mezzo_provider = mezzo_provider;
	}

	public String getIs_book_form_web_view()
	{
		return is_book_form_web_view;
	}

	public void setIs_book_form_web_view(String is_book_form_web_view)
	{
		this.is_book_form_web_view = is_book_form_web_view;
	}

	public String getBook_form_web_view_url()
	{
		return book_form_web_view_url;
	}

	public void setBook_form_web_view_url(String book_form_web_view_url)
	{
		this.book_form_web_view_url = book_form_web_view_url;
	}

	public String getBook_again_url()
	{
		return book_again_url;
	}

	public void setBook_again_url(String book_again_url)
	{
		this.book_again_url = book_again_url;
	}

	public String getThumb()
	{
		return thumb;
	}

	public void setThumb(String thumb)
	{
		this.thumb = thumb;
	}

	public Object getUser_rating()
	{
		return user_rating;
	}

	public void setUser_rating(Object user_rating)
	{
		this.user_rating = user_rating;
	}

	public String getAll_reviews_count()
	{
		return all_reviews_count;
	}

	public void setAll_reviews_count(String all_reviews_count)
	{
		this.all_reviews_count = all_reviews_count;
	}

	public String getPhotos_url()
	{
		return photos_url;
	}

	public void setPhotos_url(String photos_url)
	{
		this.photos_url = photos_url;
	}

	public String getPhoto_count()
	{
		return photo_count;
	}

	public void setPhoto_count(String photo_count)
	{
		this.photo_count = photo_count;
	}

	public String getMenu_url()
	{
		return menu_url;
	}

	public void setMenu_url(String menu_url)
	{
		this.menu_url = menu_url;
	}

	public String getFeatured_image()
	{
		return featured_image;
	}

	public void setFeatured_image(String featured_image)
	{
		this.featured_image = featured_image;
	}

	public String getMedio_provider()
	{
		return medio_provider;
	}

	public void setMedio_provider(String medio_provider)
	{
		this.medio_provider = medio_provider;
	}

	public String getHas_online_delivery()
	{
		return has_online_delivery;
	}

	public void setHas_online_delivery(String has_online_delivery)
	{
		this.has_online_delivery = has_online_delivery;
	}

	public String getIs_delivering_now()
	{
		return is_delivering_now;
	}

	public void setIs_delivering_now(String is_delivering_now)
	{
		this.is_delivering_now = is_delivering_now;
	}

	public String getStore_type()
	{
		return store_type;
	}

	public void setStore_type(String store_type)
	{
		this.store_type = store_type;
	}

	public String getInclude_bogo_offers()
	{
		return include_bogo_offers;
	}

	public void setInclude_bogo_offers(String include_bogo_offers)
	{
		this.include_bogo_offers = include_bogo_offers;
	}

	public String getDeeplink()
	{
		return deeplink;
	}

	public void setDeeplink(String deeplink)
	{
		this.deeplink = deeplink;
	}

	public String getIs_table_reservation_supported()
	{
		return is_table_reservation_supported;
	}

	public void setIs_table_reservation_supported(String is_table_reservation_supported)
	{
		this.is_table_reservation_supported = is_table_reservation_supported;
	}

	public String getHas_table_booking()
	{
		return has_table_booking;
	}

	public void setHas_table_booking(String has_table_booking)
	{
		this.has_table_booking = has_table_booking;
	}

	public String getEvents_url()
	{
		return events_url;
	}

	public void setEvents_url(String events_url)
	{
		this.events_url = events_url;
	}

	public Object getAll_reviews()
	{
		return all_reviews;
	}

	public void setAll_reviews(Object all_reviews)
	{
		this.all_reviews = all_reviews;
	}

	public String[] getEstablishment()
	{
		return establishment;
	}

	public void setEstablishment(String[] establishment)
	{
		this.establishment = establishment;
	}

	public String[] getEstablishment_types()
	{
		return establishment_types;
	}

	public void setEstablishment_types(String[] establishment_types)
	{
		this.establishment_types = establishment_types;
	}
}
