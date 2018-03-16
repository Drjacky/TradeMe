package ir.hosseinabbasi.trademe.ui.search;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.ui.base.BasePresenter;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposables;
import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/03/16.
 */

public class SearchResultPresenter<V extends ISearchResultView> extends BasePresenter<V> implements ISearchResultPresenter<V> {

    private static final String TAG = SearchResultPresenter.class.getSimpleName();

    private final ThreadTransformer threadTransformer;
    private final RxDisposables disposables;

    @Inject
    public SearchResultPresenter(DataManager dataManager,
                                 ThreadTransformer threadTransformer,
                                 RxDisposableFactory rxDisposableFactory) {
        super(dataManager, threadTransformer, rxDisposableFactory);
        this.threadTransformer = getThreadTransformer();
        this.disposables = getRxDisposables();
    }
}
