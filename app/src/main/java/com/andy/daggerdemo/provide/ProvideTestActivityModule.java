package com.andy.daggerdemo.provide;

import com.andy.daggerdemo.App;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andy on 2017/9/19.
 */
@Module
public class ProvideTestActivityModule {

    @Provides
    App provideApplication(){
        return new App();
    }
}
