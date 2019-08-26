package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @program: CoolWeather
 * @Date: 2019/8/25 23:31
 * @Author: Mr.Chen
 * @Description:
 */
public class Basic {
    /**
     * city : 苏州
     * id : CN101190401
     * update : {"loc":"2016-08-08 21:58"}
     */

    /**
     * 由于JSON中的一些字段可能不太适合直接作为Java字段来命名，因此这里使用了@SerializedName注解
     * 的方式来让JSON字段和Java字段之间建立映射关系。
     */
    @SerializedName("city")
    private String cityName;

    @SerializedName("id")
    private String weatherId;

    private Update update;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public static class Update {
        /**
         * loc : 2016-08-08 21:58
         */

        @SerializedName("loc")
        private String updateTime;

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }
}
