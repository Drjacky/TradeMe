package ir.hosseinabbasi.trademe.di.component;

import javax.inject.Singleton;

import ir.hosseinabbasi.trademe.data.network.ApiService;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
public interface NetComponent {
    @Singleton
    ApiService exposeApiService();
}
