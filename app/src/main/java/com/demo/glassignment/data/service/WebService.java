package com.demo.glassignment.data.service;



import com.demo.glassignment.data.api.WebApi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebService {

    private static final String URL = "https://pokeapi.co/api/v2/";
    private static WebService sSingleton;
    private final WebApi mWebApi;

    private WebService() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                OkHttpClient client = httpClient.build();
        Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl(URL).build();

        mWebApi = mRetrofit.create(WebApi.class);
    }

    public static WebService getInstance() {
        if (sSingleton == null) {
            synchronized (WebService.class) {
                if (sSingleton == null) {
                    sSingleton = new WebService();
                }
            }
        }
        return sSingleton;
    }

    public WebApi getWebApi() {
        return mWebApi;
    }

}
