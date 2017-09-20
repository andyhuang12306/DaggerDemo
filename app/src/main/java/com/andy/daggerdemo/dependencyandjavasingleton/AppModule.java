package com.andy.daggerdemo.dependencyandjavasingleton;

import com.andy.daggerdemo.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andy on 2017/9/20.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    App provideApp(){
        return new App();
    }
}
