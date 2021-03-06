package ir.hosseinabbasi.trademe.di.component;

import dagger.Component;
import ir.hosseinabbasi.trademe.di.PerActivity;
import ir.hosseinabbasi.trademe.di.module.ActivityModule;
import ir.hosseinabbasi.trademe.ui.base.BaseActivity;
import ir.hosseinabbasi.trademe.ui.category.CategoryListView;
import ir.hosseinabbasi.trademe.ui.detail.DetailView;
import ir.hosseinabbasi.trademe.ui.main.MainActivity;
import ir.hosseinabbasi.trademe.ui.search.SearchResultView;
import ir.hosseinabbasi.trademe.ui.splash.SplashActivity;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity activity);
    void inject(SplashActivity activity);
    void inject(MainActivity activity);
    void inject(CategoryListView fragment);
    void inject(DetailView fragment);
    void inject(SearchResultView fragment);
}
