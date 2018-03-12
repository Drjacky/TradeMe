package ir.hosseinabbasi.trademe.ui.splash;

import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.ui.base.IBaseView;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface ISplashView extends IBaseView {
    void loadCategoryList(Root categoryList);
}
