package com.example.testapp;

import android.app.Application;

import com.example.testapp.dagger.AppComponent;
import com.example.testapp.dagger.AppModule;
import com.example.testapp.dagger.DaggerAppComponent;

/**
 * Created by c59749 on 3/15/17.
 */

public class App extends Application{

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
