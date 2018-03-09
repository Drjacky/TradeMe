package ir.hosseinabbasi.trademe.utils.rx;

import io.reactivex.disposables.Disposable;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface RxDisposables {
    void add(Disposable disposable);

    void clear();
}
