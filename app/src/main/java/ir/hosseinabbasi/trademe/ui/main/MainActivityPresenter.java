package ir.hosseinabbasi.trademe.ui.main;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.search.Search;
import ir.hosseinabbasi.trademe.ui.base.BasePresenter;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposables;
import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 3/12/2018.
 */

public class MainActivityPresenter<V extends IMainActivityView> extends BasePresenter<V> implements IMainActivityPresenter<V> {

    private static final String TAG = MainActivityPresenter.class.getSimpleName();

    private final ThreadTransformer threadTransformer;
    private final RxDisposables disposables;

    @Inject
    public MainActivityPresenter(DataManager dataManager,
                                 ThreadTransformer threadTransformer,
                                 RxDisposableFactory rxDisposableFactory) {
        super(dataManager, threadTransformer, rxDisposableFactory);
        this.threadTransformer = getThreadTransformer();
        this.disposables = getRxDisposables();
    }

    @Override
    public Root getCategories() {
        return getDataManager().loadCategories();
    }

    @Override
    public void getSearchResult(String query) {
        getBaseView().showLoading();
        Map<String, String> params = new HashMap<String, String>();
        params.put("search_string", query);
        disposables.add(getDataManager().getSearchResult("JSON", params)
                .compose(threadTransformer.applySchedulers())
                .subscribe(searchResult -> {
                    getBaseView().hideLoading();
                    getBaseView().loadSearchResult(searchResult);
                }, throwable -> {
                    getBaseView().hideLoading();
                    getBaseView().onError(throwable.getMessage());
                    Log.wtf(TAG, throwable.getMessage() + "");
                }));
    }
}
