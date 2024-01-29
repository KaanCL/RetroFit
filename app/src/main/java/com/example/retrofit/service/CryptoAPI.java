package com.example.retrofit.service;

import com.example.retrofit.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET,POST,UPDATE,DELETE

    //URL BASE -> www.website.com

    //GET -> price?key=xxx

    //https://raw.githubusercontent.com/
    //atilsamancioglu/K21-JSONDataSet/master/crypto.json
    //https://raw.githubusercontent.com/
    // KaanCL/CryptoAPI/main/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Call<List<CryptoModel>> getData();


    


}
