package ir.hosseinabbasi.trademe.ui.base;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface IBasepresenter<V extends IBaseView> {
    void onAttach(V mvpView);
    void onDetach();
}
