package ir.hosseinabbasi.trademe.ui.splash;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.ui.base.BasePresenter;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposables;
import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class SplashPresenter<V extends ISplashView> extends BasePresenter<V>
        implements ISplashPresenter<V> {

    private static final String TAG = SplashPresenter.class.getSimpleName();

    private final ThreadTransformer threadTransformer;
    private final RxDisposables disposables;

    @Inject
    public SplashPresenter(DataManager dataManager,
                           ThreadTransformer threadTransformer,
                           RxDisposableFactory rxDisposableFactory) {
        super(dataManager, threadTransformer, rxDisposableFactory);
        this.threadTransformer = getThreadTransformer();
        this.disposables = getRxDisposables();
    }

    @Override
    public void getCategories() { //Need to figure out how to update the local category after first time.
        Root rootLocal = getDataManager().loadCategories();
        if (rootLocal == null) {
            Map<String, String> params = new HashMap<String, String>();
            params.put("with_counts", "false");
            disposables.add(getDataManager().getCategories("0", "JSON", params)
                    .compose(threadTransformer.applySchedulers())
                    .subscribe(rootResult -> {
                        getDataManager().saveCategories(rootResult);
                        getBaseView().loadCategoryList(rootResult);
                    }, throwable -> {
                        getBaseView().onError(throwable.getMessage());
                        Log.wtf(TAG, throwable.getMessage() + "");
                    }));
        } else getBaseView().loadCategoryList(rootLocal);
    }

}
