package com.example.testapp.dagger;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.testapp.util.SharedPreferenceHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by c59749 on 3/15/17.
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    Application providesApplication() {
        return application;
    }

    @Provides
    SharedPreferenceHelper provideSharedPreferenceHelper(){
        return new SharedPreferenceHelper(application.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE));
    }

}
