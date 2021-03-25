package com.example.uploadimagetoserverusingretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("")
    Call<ResrponseModel> uploadImage(

         @Field("EN_IMAGE") String encodeImage

    );
}
