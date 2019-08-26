package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @program: CoolWeather
 * @Date: 2019/8/25 23:50
 * @Author: Mr.Chen
 * @Description:
 */
public class Forecast {
    /**
     * date : 2016-08-08
     * cond : {"txt_d":"阵雨"}
     * tmp : {"max":"34","min":"27"}
     */

    private String date;

    @SerializedName("cond")
    private More more;

    @SerializedName("tmp")
    private Temperature temperature;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public static class More {
        /**
         * txt_d : 阵雨
         */

        @SerializedName("txt_d")
        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class Temperature {
        /**
         * max : 34
         * min : 27
         */

        private String max;
        private String min;

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }
    }
}
