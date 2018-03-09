package ir.hosseinabbasi.trademe.utils.rx.impl;

import javax.inject.Inject;

import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;
import ir.hosseinabbasi.trademe.utils.rx.qualifiers.IOThreadPref;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public final class WorkThreadTransformer implements ThreadTransformer {

    private final Scheduler subscribeOnScheduler;
    private final Scheduler observeOnScheduler;

    @Inject
    public WorkThreadTransformer(@IOThreadPref Scheduler subscribeOnScheduler,
                                 @IOThreadPref Scheduler observeOnScheduler) {
        this.subscribeOnScheduler = subscribeOnScheduler;
        this.observeOnScheduler = observeOnScheduler;
    }

    @Override
    public <T> ObservableTransformer<T, T> applySchedulers() {
        return observable -> observable.subscribeOn(subscribeOnScheduler).observeOn(observeOnScheduler);
    }

}
