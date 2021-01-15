# API-Project
RESTful API Project

This is a Java application that I built to teach myself about RESTful APIs and how to access and query them.

Program Configuration:

I used Gradle to download and manage two external libraries from the Maven repository, which were:

  - Unirest (http://kong.github.io/unirest-java/)
    - retrieves HTTP Responses from the APIs in JSON format
  - Jackson (https://github.com/FasterXML/jackson)
    - parses JSON format objects and maps them onto Java objects


APIs:

I used three distinct, free-to-access RESTful APIs:
  - Google Maps Geocoding API (https://developers.google.com/maps/documentation/geocoding/overview/)
  - Open Weather Map API (https://rapidapi.com/community/api/open-weather-map/)
  - Zomato API (https://developers.zomato.com/api/)

I used RapidAPI (http://rapidapi.com) in order to manage subscriptions (free-tier) to the Google Maps Geocoding API and the Open Weather Map API.


Application Structure:

    - First, the user is prompted for their address. 
    - The address is parsed, then passed as query parameters to the Geocoding API. 
    - The Geocoding API returns the latitude and longitude coordinates of the input address. 
    - These coordinates are then passed as query parameters to the Open Weather Map API. 
    - The Open Weather Map API returns the weather conditions. 
    - Finally, the program conditionally checks the current weather, then decides which restaurant recommendations to give. 
    - If the temperature is less than 60 degrees F, the program will return takeout options close to the user. 
    - Otherwise, the program returns restaurants that have patio dining options. 
    - In both cases, the Zomato query is built using the coordinates and user inputs.
    
Results: https://imgur.com/a/v2WaWg3?

Notes: 

  - My application is simple in nature, as I am aiming to demonstrate the API funcionality specifically. 
  - This application is very customizable, as I built the Java classes to retain all weather and location information.
  - The Zomato API query is also customizable, and can be set to return specific cuisines, delivery restaurants, etc. 
