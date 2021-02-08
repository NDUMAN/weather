package com.example.summerschool_1.weatherappthelegacy.Retrofit;

import com.example.summerschool_1.weatherappthelegacy.Model.weatherForecastResult;
import com.example.summerschool_1.weatherappthelegacy.Model.weatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap
{
    @GET("weather")
    Observable<weatherResult> getWeatherByLatLng(@Query("lat")   String lat,
                                                 @Query("lon")   String lon,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit );

    @GET("forecast")
    Observable<weatherForecastResult> getForecastWeatherByLatLng(@Query("lat")   String lat,
                                                                 @Query("lon")   String lon,
                                                                 @Query("appid") String appid,
                                                                 @Query("units") String unit );
}


