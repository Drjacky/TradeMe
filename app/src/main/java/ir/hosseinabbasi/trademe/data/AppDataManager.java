package ir.hosseinabbasi.trademe.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import ir.hosseinabbasi.trademe.data.network.ApiService;
import ir.hosseinabbasi.trademe.di.ApplicationContext;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
public class AppDataManager implements DataManager {
    private static final String TAG = "AppDataManager";

    private final Context mContext;
    private final ApiService mApiService;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          ApiService apiService) {
        mContext = context;
        mApiService = apiService;
    }
}
