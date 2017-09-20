package com.andy.daggerdemo.dependencyandjavasingleton;

import com.andy.daggerdemo.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by andy on 2017/9/20.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    App getApp();
}
