package com.example.myapplication;



import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.POST;


public interface UserService {
    @POST("auth/login")
    Call<LoginResponse> UserLogin (@Body LoginRequest loginRequest);
}
