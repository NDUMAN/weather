package com.example.summerschool_1.weatherappthelegacy.WithKey;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common
{
    public static final String APP_ID="15c5acc3f7bfeb3bbc47730986b4f5b3";
    public  static Location current_location=null;


    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd EEE MM yyy");
        String formatted = sdf.format(date);
        return  formatted;

    }

    public static String ConvertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return  formatted;

    }
}
