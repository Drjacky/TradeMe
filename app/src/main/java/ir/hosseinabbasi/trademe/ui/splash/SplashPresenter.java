package ir.hosseinabbasi.trademe.ui.splash;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import ir.hosseinabbasi.trademe.data.DataManager;
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
    public void getCategories() {

    }
}
