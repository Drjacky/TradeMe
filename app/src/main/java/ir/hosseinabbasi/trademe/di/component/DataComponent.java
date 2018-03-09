package ir.hosseinabbasi.trademe.di.component;

import javax.inject.Singleton;

import ir.hosseinabbasi.trademe.data.db.IDbService;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
public interface DataComponent {
    @Singleton
    IDbService exposeIDbService();
}
