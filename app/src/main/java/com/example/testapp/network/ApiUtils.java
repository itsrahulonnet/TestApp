package com.example.testapp.network;

/**
 * Created by c59749 on 3/16/17.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public static Api getApi(){
        return RetrofitClient.getClient(BASE_URL).create(Api.class);
    }
}
