package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @program: CoolWeather
 * @Date: 2019/8/25 23:40
 * @Author: Mr.Chen
 * @Description:
 */
public class Now {
    /**
     * tmp : 29
     * cond : {"txt":"阵雨"}
     */

    @SerializedName("tmp")
    private String temperature;

    @SerializedName("cond")
    private More more;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }

    public static class More {
        /**
         * txt : 阵雨
         */

        @SerializedName("txt")
        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
