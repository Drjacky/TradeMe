package ir.hosseinabbasi.trademe.ui.category;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.data.DataManager;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.ui.base.BasePresenter;
import ir.hosseinabbasi.trademe.ui.main.MainActivityPresenter;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.trademe.utils.rx.RxDisposables;
import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 3/14/2018.
 */

public class CategoryListPresenter<V extends ICategoryListView> extends BasePresenter<V> implements ICategoryListPresenter<V> {

    private static final String TAG = CategoryListPresenter.class.getSimpleName();

    private final ThreadTransformer threadTransformer;
    private final RxDisposables disposables;

    @Inject
    public CategoryListPresenter(DataManager dataManager,
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
    public SubcategoriesItem getSubCatAt(String parentNumber) {
        return getDataManager().loadSubCatAt(parentNumber);
    }

}
