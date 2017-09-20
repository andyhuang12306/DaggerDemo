package com.andy.daggerdemo.dependencyandjavasingleton;

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
 * Created by andy on 2017/9/20.
 */

public class DependencyTestActivity extends AppCompatActivity {

    @Inject
    App mApp1;

    @Inject
    App mApp2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_test);
        ButterKnife.bind(this);
        DaggerDependencyTestComponent.builder()
                .appComponent(((App)getApplication()).getAppComponent())
                .dependencyTestModule(new DependencyTestModule())
                .build().inject(this);
    }

    @OnClick({R.id.dependency})
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.dependency:
                Toast.makeText(this, mApp1.toString()+":"+mApp2.toString(), Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
