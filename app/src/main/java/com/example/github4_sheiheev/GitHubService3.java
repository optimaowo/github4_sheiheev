package com.example.github4_sheiheev;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface GitHubService3 {

    // GET /users/:username/repos
    @GET("users/{username}/repos")
    Call<List<Repos>> getRepos(@Path("username") String userName);

    @GET("/users/{username}")
    Call<User> getUser(
            @Path("username") String userName
    );



    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}

