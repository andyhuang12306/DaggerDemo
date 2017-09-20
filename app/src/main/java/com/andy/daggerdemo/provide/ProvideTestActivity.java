package com.andy.daggerdemo.provide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.andy.daggerdemo.App;
import com.andy.daggerdemo.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by andy on 2017/9/19.
 */

public class ProvideTestActivity extends AppCompatActivity{

    @Inject
    App mApp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provide_test_activity);
        ButterKnife.bind(this);
        DaggerProvideTestActivityComponent.builder()
                .provideTestActivityModule(new ProvideTestActivityModule())
                .build().inject(this);

    }

    @OnClick({R.id.provide})
    public void onClick(View v){
        int id = v.getId();
        switch (id) {
            case R.id.provide:
                Toast.makeText(this, mApp.name, Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
