package ir.hosseinabbasi.trademe.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface IBaseView {
    void showLoading();
    void hideLoading();
    void onError(@StringRes int resId);
    void onError(String message);
    boolean isNetworkConnected();
}
