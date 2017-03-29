package com.example.testapp.network;

import com.example.testapp.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c59749 on 3/16/17.
 */

public interface Api {

    @GET("posts")
    Observable<List<Post>> getPosts();
}
