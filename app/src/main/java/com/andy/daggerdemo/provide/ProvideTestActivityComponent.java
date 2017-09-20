package com.andy.daggerdemo.provide;

import dagger.Component;

/**
 * Created by andy on 2017/9/19.
 */
@Component(modules = ProvideTestActivityModule.class)
public interface ProvideTestActivityComponent {
    void inject(ProvideTestActivity activity);
}
