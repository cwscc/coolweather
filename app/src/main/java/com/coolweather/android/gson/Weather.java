package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @program: CoolWeather
 * @Date: 2019/8/25 23:54
 * @Author: Mr.Chen
 * @Description:
 */
public class Weather {
    /**
     * status : ok
     * basic : {}
     * aqi : {}
     * Now : {}
     * suggestion : {}
     * daily_forecast : []
     */

    private String status;

    private Basic basic;

    private AQI aqi;

    private Now now;

    private Suggestion suggestion;

    @SerializedName("daily_forecast")
    private List<Forecast> forecastList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public AQI getAqi() {
        return aqi;
    }

    public void setAqi(AQI aqi) {
        this.aqi = aqi;
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }

    public void setForecastList(List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }
}
