package com.andy.daggerdemo.dependencyandjavasingleton;

import dagger.Component;

/**
 * Created by andy on 2017/9/20.
 */
@PerDependency
@Component(dependencies = AppComponent.class, modules = DependencyTestModule.class)
public interface DependencyTestComponent {
    void inject(DependencyTestActivity activity);
}
