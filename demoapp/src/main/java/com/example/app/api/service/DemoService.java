package com.example.app.api.service;

import com.example.app.api.model.Sentence;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DemoService {

    @Headers({ "Content-Type: application/json" })
    @POST("/endPoint")
    Call<String> demoFunction(@Body Sentence sentence);
}
