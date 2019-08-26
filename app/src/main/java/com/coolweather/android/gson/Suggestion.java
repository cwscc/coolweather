package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @program: CoolWeather
 * @Date: 2019/8/25 23:43
 * @Author: Mr.Chen
 * @Description:
 */
public class Suggestion {
    /**
     * comf : {"txt":"白天天气较热，虽然有雨，但仍然无法削弱较高气温给人们带来的暑意，这种天气会让您感到不很舒适。"}
     * cw : {"txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
     * sport : {"txt":"有降水，且风力较强，推荐您在室内进行低强度运动；若坚持户外运动，请选择避雨防风的地点。"}
     */

    @SerializedName("comf")
    private Comfort comfort;

    @SerializedName("cw")
    private CarWash carWash;

    private Sport sport;

    public Comfort getComfort() {
        return comfort;
    }

    public void setComfort(Comfort comfort) {
        this.comfort = comfort;
    }

    public CarWash getCarWash() {
        return carWash;
    }

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public static class Comfort {
        /**
         * txt : 白天天气较热，虽然有雨，但仍然无法削弱较高气温给人们带来的暑意，             这种天气会让您感到不很舒适。
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

    public static class CarWash {
        /**
         * txt : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水             可能会再次弄脏您的爱车。
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

    public static class Sport {
        /**
         * txt : 有降水，且风力较强，推荐您在室内进行低强度运动；若坚持户外运动，             请选择避雨防风的地点。
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
