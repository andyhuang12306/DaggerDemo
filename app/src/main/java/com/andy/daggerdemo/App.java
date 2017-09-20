package com.andy.daggerdemo;

import android.app.Application;

import com.andy.daggerdemo.dependencyandjavasingleton.AppComponent;
import com.andy.daggerdemo.dependencyandjavasingleton.DaggerAppComponent;

/**
 * Created by andy on 2017/9/19.
 */

public class App extends Application {

    public String name="I'm APP";
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
