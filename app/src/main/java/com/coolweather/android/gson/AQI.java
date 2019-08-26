package com.coolweather.android.gson;

/**
 * @program: CoolWeather
 * @Date: 2019/8/25 23:37
 * @Author: Mr.Chen
 * @Description:
 */
public class AQI {
    /**
     * city : {"aqi":"44","pm25":"13"}
     */

    private AQICity city;

    public AQICity getCity() {
        return city;
    }

    public void setCity(AQICity city) {
        this.city = city;
    }

    public static class AQICity {
        /**
         * aqi : 44
         * pm25 : 13
         */

        private String aqi;
        private String pm25;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }
    }
}
