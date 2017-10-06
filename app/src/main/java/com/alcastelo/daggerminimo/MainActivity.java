package com.alcastelo.daggerminimo;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Presenter presenter;

    @Inject
    Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //DaggerDiComponent.create().inject(this);
        ((prueba) getApplication()).getNetComponent().inject(this);
        Log.d("aplicaci", application.getPackageName());
        Log.d("MainActivity", presenter.greet());

    }
}
