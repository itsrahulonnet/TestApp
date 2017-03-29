package com.example.testapp.util;

import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by c59749 on 3/15/17.
 */

@Singleton
public class SharedPreferenceHelper {

    public static final String NAME = "name";

    private SharedPreferences sharedPreferences;

    @Inject
    public SharedPreferenceHelper(SharedPreferences sharedPreferences){
        this.sharedPreferences = sharedPreferences;
    }

    public void putName(String value){
        sharedPreferences.edit().putString(NAME, value).apply();
    }

    public String getName(){
        return sharedPreferences.getString(NAME, null);
    }
}
