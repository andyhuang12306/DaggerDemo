package com.andy.daggerdemo.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by andy on 2017/9/19.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface America {
}
