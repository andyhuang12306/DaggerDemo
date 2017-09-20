package com.andy.daggerdemo.qualifier;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.andy.daggerdemo.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by andy on 2017/9/19.
 */

public class QualifierTestActivity extends AppCompatActivity{

    @Inject
    @China
    NationLeader mChinaChairMan;

    @Inject
    @America
    NationLeader mAmericanPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualifier_test);
        ButterKnife.bind(this);
        DaggerQualifierTestComponent.create().inject(this);
    }

    @OnClick({R.id.qualifier})
    public void onClick(View v){
        int id = v.getId();
        switch (id) {
            case R.id.qualifier:
                mChinaChairMan.initName();
                mAmericanPresenter.initName();
                Toast.makeText(this, ((ChinaChairMan)mChinaChairMan).name+((AmericanPresenter)mAmericanPresenter).name, Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
