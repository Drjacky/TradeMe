package ir.hosseinabbasi.trademe.di.component;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Component;
import ir.hosseinabbasi.trademe.MyApplication;
import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.data.db.IDbService;
import ir.hosseinabbasi.trademe.data.network.IApiService;
import ir.hosseinabbasi.trademe.di.ApplicationContext;
import ir.hosseinabbasi.trademe.di.module.ApplicationModule;
import ir.hosseinabbasi.trademe.di.module.DataModule;
import ir.hosseinabbasi.trademe.di.module.NetModule;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class, DataModule.class})
public interface ApplicationComponent extends NetComponent, DataComponent{
    void inject(MyApplication app);

    @ApplicationContext
    Context context();

    Resources exposeResources();

    Application application();

    DataManager getDataManager();

    @Override
    IApiService exposeIApiService();

    @Override
    IDbService exposeIDbService();
}
