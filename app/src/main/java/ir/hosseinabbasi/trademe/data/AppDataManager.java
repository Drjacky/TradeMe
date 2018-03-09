package ir.hosseinabbasi.trademe.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import ir.hosseinabbasi.trademe.data.network.IApiService;
import ir.hosseinabbasi.trademe.di.ApplicationContext;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Singleton
public class AppDataManager implements DataManager {
    private static final String TAG = "AppDataManager";

    private final Context mContext;
    private final IApiService mIApiService;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          IApiService IApiService) {
        mContext = context;
        mIApiService = IApiService;
    }
}
