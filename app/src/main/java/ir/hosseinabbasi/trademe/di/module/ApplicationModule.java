package ir.hosseinabbasi.trademe.di.module;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.hosseinabbasi.trademe.data.AppDataManager;
import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.di.ApplicationContext;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Resources provideAppResources() {
        return mApplication.getResources();
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }
}
