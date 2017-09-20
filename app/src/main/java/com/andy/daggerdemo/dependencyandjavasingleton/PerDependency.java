package com.andy.daggerdemo.dependencyandjavasingleton;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by andy on 2017/9/20.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerDependency {
}
