package ir.hosseinabbasi.trademe.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import ir.hosseinabbasi.trademe.data.db.IDbService;
import ir.hosseinabbasi.trademe.data.db.model.Root;
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
    private final IDbService mDbService;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          IApiService IApiService,
                          IDbService dbService) {
        mContext = context;
        mIApiService = IApiService;
        mDbService = dbService;
    }

    @Override
    public Observable<Root> getCategories(String number, String fileFormat) {
        return mIApiService.getCategories(number, fileFormat);
    }

    @Override
    public Root loadCategories() {
        return mDbService.loadCategories();
    }

    @Override
    public void saveCategories(Root root) {
        mDbService.saveCategories(root);
    }

    @Override
    public Root loadSubCatAt(String parentNumber) {
        return mDbService.loadSubCatAt(parentNumber);
    }
}
