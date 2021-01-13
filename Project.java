import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.LogManager;

public class Project {

	public static void main(String[] args) throws IOException
	{
		LogManager.getLogManager().reset();

		Scanner s = new Scanner(System.in);
		System.out.println("\nHello! This application will recommend dining options");
		System.out.println("based on your location and the weather.\n");
		System.out.println("Enter address in format (2101 Ross Ave, Dallas, TX): ");
		String input = s.nextLine();
		String[] split = input.split(", ");


		com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper(); // create once, reuse

		HttpResponse<byte[]> goog = Unirest.get("https://google-maps-geocoding.p.rapidapi.com/geocode/json?address="+
														split[0].replaceAll(" ","%20")+"%2C%20"
												+split[1].replaceAll(" ","%20")+"%2C%20"+split[2]+"&language=en")
				.header("x-rapidapi-key", "c2a36e5180msh75f4f70f962f039p1b43b4jsn20efad3ea5be")
				.header("x-rapidapi-host", "google-maps-geocoding.p.rapidapi.com")
				.asBytes();

		//1100 Lake Carolyn Pkwy, Irving, TX
		GeocodeResult g = mapper.readValue(goog.getBody(), GeocodeResult.class);



		String latd = g.getResults().get(0).getGeometry().getGeocodeLocation().getLatitude();

		String lond = g.getResults().get(0).getGeometry().getGeocodeLocation().getLongitude();


		HttpResponse<byte[]> response = Unirest.get("https://community-open-weather-map.p.rapidapi.com/weather?q="+split[1]+"%2Cus&lat="+latd+"&lon="+lond
															+"&lang=en&units=imperial")
	.header("x-rapidapi-key", "c2a36e5180msh75f4f70f962f039p1b43b4jsn20efad3ea5be")
	.header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
	.asBytes();

		WeatherNode w =  mapper.readValue(response.getBody(), WeatherNode.class);

		Double temp = Double.parseDouble(w.getMain().getTemp());

		System.out.println("\nThe temperature outside is " + temp + " degrees F.");

		System.out.println("Currently, the weather conditions are: " + w.getWeather()[0].getDescription()+".\n");


		HttpResponse<byte[]> zomatoLoc = Unirest.get("https://developers.zomato.com/api/v2.1/locations?query="+split[1]+"%2C%20"+split[2]+
														  "&lat="+latd+"&lon="+lond+"&count=1")
				.header("user-key", "6fc83eb3d627c04c042fb31669821219")
				.asBytes();



		LocationNode l =  mapper.readValue(zomatoLoc.getBody(), LocationNode.class);

		String id = l.getLocation_suggestions()[0].getEntityID();
		String entity = l.getLocation_suggestions()[0].getEntityType();


		if (temp < 60) {
			System.out.println("Since the temperature is less than 60 degrees, consider these takeout options: \n");
			HttpResponse<byte[]> zomatoRest = Unirest.get("https://developers.zomato.com/api/v2.1/search?entity_id=" + id + "&entity_type=" + entity +
																  "&count=3&lat=" + latd + "&lon=" + lond + "&radius=200&category=5&sort=real_distance&order=asc")
					.header("user-key", "6fc83eb3d627c04c042fb31669821219")
					.asBytes();
			ZomatoSearch z =  mapper.readValue(zomatoRest.getBody(), ZomatoSearch.class);
			for (int i = 0; i < 3; i++) {
				System.out.println(i+1 + ": " + z.getRestaurants()[i].getRestaurant().getName());
				System.out.println(z.getRestaurants()[i].getRestaurant().getLocation().getAddress()+"\n");
			}
		}
		else {
			System.out.println("Since the temperature is greater than 60 degrees, consider these patio dining options: \n");
			HttpResponse<byte[]> zomatoRest2 = Unirest.get("https://developers.zomato.com/api/v2.1/search?entity_id=" + id + "&entity_type=" + entity +
																  "&count=3&lat=" + latd + "&lon=" + lond + "&radius=200&collection_id=482&sort=real_distance&order=asc")
					.header("user-key", "6fc83eb3d627c04c042fb31669821219")
					.asBytes();
			ZomatoSearch z =  mapper.readValue(zomatoRest2.getBody(), ZomatoSearch.class);
			for (int i = 0; i < 3; i++) {
				System.out.println(i+1 + ": " + z.getRestaurants()[i].getRestaurant().getName());
				System.out.println(z.getRestaurants()[i].getRestaurant().getLocation().getAddress()+"\n");
			}


		}

		System.out.println("Enjoy your meal!");
		Unirest.shutDown();



		}


		}



