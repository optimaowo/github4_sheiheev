package com.example.github4_sheiheev;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface GitHubService4 {

    // GET /search/users

    @GET("/search/users")
    Call<GitResult> getUsers(@Query("q") String name);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}