package com.andy.daggerdemo.inject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.andy.daggerdemo.R;
import com.andy.daggerdemo.dependencyandjavasingleton.DependencyTestActivity;
import com.andy.daggerdemo.provide.ProvideTestActivity;
import com.andy.daggerdemo.qualifier.QualifierTestActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    InjectBean mInjectBean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().build().inject(this);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.inject_test, R.id.provide_test, R.id.scope_test, R.id.qualifier_test, R.id.dependency_test})
    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.inject_test:
                Toast.makeText(this, mInjectBean.name, Toast.LENGTH_SHORT).show();
                break;
            case R.id.provide_test:
                startActivity(new Intent(this, ProvideTestActivity.class));
                break;
            case R.id.qualifier_test:
                startActivity(new Intent(this, QualifierTestActivity.class));
                break;
            case R.id.dependency_test:
                startActivity(new Intent(this, DependencyTestActivity.class));
                break;
        }
    }
}
