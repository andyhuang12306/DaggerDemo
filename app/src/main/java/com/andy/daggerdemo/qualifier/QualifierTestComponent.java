package com.andy.daggerdemo.qualifier;

import dagger.Component;

/**
 * Created by andy on 2017/9/19.
 */
@Component(modules = QualifierTestActivityModule.class)
public interface QualifierTestComponent {
    void inject(QualifierTestActivity activity);
}
