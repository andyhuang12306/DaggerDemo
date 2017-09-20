package com.andy.daggerdemo.qualifier;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andy on 2017/9/19.
 */
@Module
public class QualifierTestActivityModule {

    @Provides
    @China
    NationLeader provideChinaChairMan(ChinaChairMan chinaChairMan){
        return chinaChairMan;
    }

    @Provides
    @America
    NationLeader provideAmericanPresenter(AmericanPresenter americanPresenter){
        return americanPresenter;
    }

}
