package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 在onCreate()方法的一开始，即刚打开app时，先从SharedPreferences文件中读取缓存数据，
         * 如果不为null就说明之前已经请求过某个county的天气数据了，那么就没必要让用户再次选择城市，
         * 直接跳转到WeatherActivity以显示先前选择过的county的天气就可以了。
         */
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
