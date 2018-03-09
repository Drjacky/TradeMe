package ir.hosseinabbasi.trademe.di.component;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Component;
import ir.hosseinabbasi.trademe.MyApplication;
import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.data.network.ApiService;
import ir.hosseinabbasi.trademe.di.ApplicationContext;
import ir.hosseinabbasi.trademe.di.module.ApplicationModule;
import ir.hosseinabbasi.trademe.di.module.NetModule;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class})
public interface ApplicationComponent extends NetComponent{
    void inject(MyApplication app);

    @ApplicationContext
    Context context();

    Resources exposeResources();

    Application application();

    DataManager getDataManager();

    @Override
    ApiService exposeApiService();
}
