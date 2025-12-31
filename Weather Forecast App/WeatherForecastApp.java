
import java.util.ArrayList;
import java.util.*;

class CityWeather 
{
    String city;
    double temperature;
    int humidity;
    String forecast;

    CityWeather(String city, double temperature, int humidity, String forecast) 
    {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.forecast = forecast;
    }

    @Override
    public String toString() 
    {
        return  "City       : " + city + "\n" +
                "Temperature: " + temperature + "C\n" +
                "Humidity   : " + humidity + " %\n" +
                "Forecast   : " + forecast;
    }
}

public class WeatherForecastApp {
    public static void main(String[] args) 
    {
        ArrayList<CityWeather> cities = new ArrayList<>();
        cities.add(new CityWeather("Surat", 32.5, 70, "Sunny"));
        cities.add(new CityWeather("Mumbai", 30.2, 80, "Rainy"));
        cities.add(new CityWeather("Delhi", 28.7, 60, "Cloudy"));
        cities.add(new CityWeather("Chennai", 33.1, 75, "Humid"));
        cities.add(new CityWeather("Bangalore", 27.0, 65, "Partly Cloudy"));

        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter city name: ");
            String inputCity = sc.nextLine();
            CityWeather cityReport = null;
            for (CityWeather cw : cities) 
            {
                if (cw.city.equalsIgnoreCase(inputCity)) 
                {
                    cityReport = cw;
                    break;
                }
            }

            if (cityReport != null) 
            {
                System.out.println("\n--- Weather Report ---");
                System.out.println(cityReport);
            } 
            else 
                System.out.println("city not found in our records.");

        } 
        catch(Exception e) 
        {
            System.out.println(" Please enter a valid city name.");
        }
    }
}
