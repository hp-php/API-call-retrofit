package com.example.demoapicallretrofit.api;

import com.example.apicallretrofit.models.AddUserResponse;
import com.example.apicallretrofit.models.SingleUserResponse;
import com.example.apicallretrofit.models.UserResponse;
import com.example.apicallretrofit.models.requests.AddUserRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIInterface {

    @GET("users")
    @Headers({"Accept: application/json"})
    Call<UserResponse> getUsers();

    @GET("users/{id}")
    @Headers({"Accept: application/json"})
    Call<SingleUserResponse> getUser(@Path("id") String id);

    @POST("users")
    @Headers({"Accept: application/json"})
    Call<AddUserResponse> addUser(@Body AddUserRequest request);

}
