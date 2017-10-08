package com.cmput401f17.eplscavengerhunt;

import android.app.Application;

import com.cmput401f17.eplscavengerhunt.dagger.AppComponent;
import com.cmput401f17.eplscavengerhunt.dagger.AppModule;
import com.cmput401f17.eplscavengerhunt.dagger.DaggerAppComponent;

public class ScavengerHuntApplication extends Application {
    private static ScavengerHuntApplication instance;
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent();
        instance = this;
    }

    public static ScavengerHuntApplication getInstance() {
        return instance;
    }

    public AppComponent getAppComponent() {
        if (appComponent == null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }
}
