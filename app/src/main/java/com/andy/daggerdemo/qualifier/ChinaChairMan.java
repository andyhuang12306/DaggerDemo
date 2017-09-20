package com.andy.daggerdemo.qualifier;

import javax.inject.Inject;

/**
 * Created by andy on 2017/9/19.
 */

public class ChinaChairMan implements NationLeader{

    public String name;

    @Inject
    public ChinaChairMan(){
        initName();
    }

    @Override
    public void initName() {
        name="习近平";
    }
}
