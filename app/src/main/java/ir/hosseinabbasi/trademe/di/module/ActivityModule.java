package ir.hosseinabbasi.trademe.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import ir.hosseinabbasi.trademe.di.ActivityContext;
import ir.hosseinabbasi.trademe.di.PerActivity;
import ir.hosseinabbasi.trademe.ui.splash.ISplashPresenter;
import ir.hosseinabbasi.trademe.ui.splash.ISplashView;
import ir.hosseinabbasi.trademe.ui.splash.SplashPresenter;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @PerActivity
    ISplashPresenter<ISplashView> provideSplashPresenter(SplashPresenter<ISplashView>
                                                                     presenter) {
        return presenter;
    }
}
