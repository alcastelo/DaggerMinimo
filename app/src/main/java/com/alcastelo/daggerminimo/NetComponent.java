package com.alcastelo.daggerminimo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by angel on 6/10/17.
 */

@Singleton
@Component(modules={AppModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}