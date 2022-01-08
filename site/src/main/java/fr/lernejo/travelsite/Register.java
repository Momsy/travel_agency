package fr.lernejo.travelsite;



public record Register(String userEmail, String userName, String userCountry, WeatherExpectation weatherExpectation, int minimumTemperatureDistance) {
    enum WeatherExpectation
    {
        COLDER, WARMER;
    }
}
