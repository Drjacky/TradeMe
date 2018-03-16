package ir.hosseinabbasi.trademe.ui.detail;

import android.util.Log;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.ui.base.BasePresenter;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposables;
import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/03/15.
 */

public class DetailPresenter<V extends IDetailView> extends BasePresenter<V> implements IDetailPresenter<V> {

    private static final String TAG = DetailPresenter.class.getSimpleName();

    private final ThreadTransformer threadTransformer;
    private final RxDisposables disposables;

    @Inject
    public DetailPresenter(DataManager dataManager,
                                 ThreadTransformer threadTransformer,
                                 RxDisposableFactory rxDisposableFactory) {
        super(dataManager, threadTransformer, rxDisposableFactory);
        this.threadTransformer = getThreadTransformer();
        this.disposables = getRxDisposables();
    }

    @Override
    public void getDetail(String listingId) {
        getBaseView().showLoading();
        disposables.add(getDataManager().getDetail(listingId.replaceAll("-", ""), "JSON") //HTTP 400 error!
                .compose(threadTransformer.applySchedulers())
                .subscribe(listingResult -> {
                    getBaseView().hideLoading();
                    getBaseView().loadDetail(listingResult);
                }, throwable -> {
                    getBaseView().hideLoading();
                    getBaseView().onError(throwable.getMessage());
                    Log.wtf(TAG, throwable.getMessage() + "");
                }));

    }
}
