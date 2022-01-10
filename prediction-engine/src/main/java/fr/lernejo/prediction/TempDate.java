package fr.lernejo.prediction;

import java.util.ArrayList;

public record TempDate(String country , ArrayList<Temperature> temperatures)
{
    public TempDate(String country,ArrayList<Temperature> temperatures)
    {
        this.country=country;
        this.temperatures=temperatures;
    }
}
