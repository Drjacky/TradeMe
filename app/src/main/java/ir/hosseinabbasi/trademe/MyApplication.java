package ir.hosseinabbasi.trademe;

import android.app.Application;
import android.content.Context;

import ir.hosseinabbasi.trademe.di.component.ApplicationComponent;
import ir.hosseinabbasi.trademe.di.component.DaggerApplicationComponent;
import ir.hosseinabbasi.trademe.di.module.ApplicationModule;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class MyApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponents();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    private void initComponents() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
    }

}
