package fr.lernejo.travelsite;

public record TravelCountry(String pays , Float temperature)
{
    public TravelCountry(String pays, Float temperature)
    {
        this.pays=pays;
        this.temperature=temperature;
    }
}
