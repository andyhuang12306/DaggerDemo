package com.andy.daggerdemo.dependencyandjavasingleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andy on 2017/9/20.
 */
@Module
public class DependencyTestModule {

    @Provides
    @PerDependency
    DependencyTestBean provideDependencyBean(){
        return new DependencyTestBean();
    }
}
