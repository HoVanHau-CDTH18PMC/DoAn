package com.chau.phimplus.Server;

import com.chau.phimplus.Models.TaiKhoan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Dataserver {

    @GET("login.php")
    Call<List<TaiKhoan>> getTaiKhoan();

    @POST("register.php")
    @FormUrlEncoded
    Call<List<TaiKhoan>> savePost(
            @Field("Phone") String Phone,
            @Field("Password") String Password
    );

}
