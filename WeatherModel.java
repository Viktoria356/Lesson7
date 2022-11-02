package lesson7;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherModel
{
    default void getWeather(String selectedCity, Period period) throws IOException, SQLException {

    }

    void getSavedToDBWeather();
}
