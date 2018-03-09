package ir.hosseinabbasi.trademe.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.hosseinabbasi.trademe.data.db.DbService;
import ir.hosseinabbasi.trademe.data.db.IDbService;
import ir.hosseinabbasi.trademe.data.db.RealmManager;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Module
public class DataModule {

    @Provides
    IDbService provideIDbService(DbService dbService){
        return dbService;
    }

    @Provides
    @Singleton
    RealmManager realmManager(){
        return new RealmManager();
    }
}
