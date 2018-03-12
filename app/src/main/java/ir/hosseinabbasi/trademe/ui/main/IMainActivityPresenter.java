package ir.hosseinabbasi.trademe.ui.main;

import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.ui.base.IBasepresenter;

/**
 * Created by Dr.jacky on 3/12/2018.
 */

public interface IMainActivityPresenter<V extends IMainActivityView> extends IBasepresenter<V> {
    Root getCategories();
}
