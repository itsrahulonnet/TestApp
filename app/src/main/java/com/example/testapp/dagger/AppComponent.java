package com.example.testapp.dagger;

import android.app.Application;

import com.example.testapp.App;
import com.example.testapp.activities.Main2Activity;
import com.example.testapp.activities.MainActivity;
import com.example.testapp.util.SharedPreferenceHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by c59749 on 3/15/17.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(Main2Activity main2Activity);
}
