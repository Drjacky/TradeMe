package ir.hosseinabbasi.trademe.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.hosseinabbasi.trademe.data.network.ApiEndPoint;
import ir.hosseinabbasi.trademe.data.network.IApiService;
import ir.hosseinabbasi.trademe.utils.NetworkUtils;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
@Module
public class NetModule {

    @Provides
    @Singleton
    public IApiService provideApi(Retrofit retrofit) {
        return retrofit.create(IApiService.class);
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiEndPoint.ENDPOINT_TRADEME)
                .client(NetworkUtils.Companion.getCustomRetrofitHeader().build())
                .build();
    }

}
