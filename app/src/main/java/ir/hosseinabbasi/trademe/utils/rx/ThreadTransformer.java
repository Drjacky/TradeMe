package ir.hosseinabbasi.trademe.utils.rx;

import io.reactivex.ObservableTransformer;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface ThreadTransformer {
    <T> ObservableTransformer<T, T> applySchedulers();
}
