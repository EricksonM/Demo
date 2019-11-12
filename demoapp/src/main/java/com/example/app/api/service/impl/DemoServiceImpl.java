package com.example.app.api.service.impl;

import com.example.app.api.model.Sentence;
import com.example.app.api.service.DemoService;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class DemoServiceImpl {

    private static final String URL_ = "http://";

    Retrofit retrofit = new Retrofit.Builder().baseUrl(URL_)
                            .addConverterFactory(GsonConverterFactory.create()).build();

    DemoService demoService = retrofit.create(DemoService.class);

    public String demoFunction(Sentence sentence) throws IOException {
        Call<String> stringCall = demoService.demoFunction(sentence);
        return stringCall.execute().body();
    }

}
