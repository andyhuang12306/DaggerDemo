package com.andy.daggerdemo.inject;

import com.andy.daggerdemo.inject.MainActivity;

import dagger.Component;

/**
 * Created by andy on 2017/9/19.
 */
@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
