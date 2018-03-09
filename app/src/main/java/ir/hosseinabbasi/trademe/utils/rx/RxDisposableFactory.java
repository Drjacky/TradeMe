package ir.hosseinabbasi.trademe.utils.rx;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.utils.rx.impl.CompositeDisposablesImpl;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class RxDisposableFactory {
    @Inject
    public RxDisposableFactory() {
    }

    public RxDisposables get() {
        return new CompositeDisposablesImpl();
    }
}
