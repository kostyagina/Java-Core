package homeworkLesson8.project;

import homeworkLesson8.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
