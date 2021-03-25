package com.example.uploadimagetoserverusingretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    private  static  final String BASE__URL = "http://192.168.0.104/php/Imageuplod/";
    private static Client myClient;
    private Retrofit retrofit;



    private  Client(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE__URL).addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized Client getInstance(){
        if (myClient==null){
            myClient=new Client();
        }
        return myClient;
    }

    public Api getApi(){
        return retrofit.create(Api.class);

    }
}
