package com.alcastelo.daggerminimo;

import dagger.Component;

/**
 * Created by angel on 6/10/17.
 */

@Component
interface DiComponent {
    //void inject(MainActivity activity);
    void inject(Main2Activity main2Activity);
}