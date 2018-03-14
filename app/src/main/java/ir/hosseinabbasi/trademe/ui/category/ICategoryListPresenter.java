package ir.hosseinabbasi.trademe.ui.category;

import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.ui.base.IBasepresenter;

/**
 * Created by Dr.jacky on 3/14/2018.
 */

public interface ICategoryListPresenter<V extends ICategoryListView> extends IBasepresenter<V> {
    Root getCategories();
    Root getSubCatAt(String parentNumber);
}
