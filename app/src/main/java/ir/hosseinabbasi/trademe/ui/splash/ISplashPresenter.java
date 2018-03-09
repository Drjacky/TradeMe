package ir.hosseinabbasi.trademe.ui.splash;

import ir.hosseinabbasi.trademe.ui.base.IBasepresenter;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface ISplashPresenter<V extends ISplashView> extends IBasepresenter<V> {
    void getCategories();
}
