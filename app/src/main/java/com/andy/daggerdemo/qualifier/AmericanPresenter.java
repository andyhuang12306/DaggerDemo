package com.andy.daggerdemo.qualifier;

import javax.inject.Inject;

/**
 * Created by andy on 2017/9/19.
 */

public class AmericanPresenter implements NationLeader {

    public String name;

    @Inject
    public AmericanPresenter(){
        initName();
    }

    @Override
    public void initName() {
        name="特普朗";
    }
}
