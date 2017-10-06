package com.alcastelo.daggerminimo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by angel on 6/10/17.
 */

public class Presenter {
    @Inject
    public Presenter() {
        Log.d("Presenter", "constructor"); 
    }

    public String greet() {
        return "alehoop";
    }
}

