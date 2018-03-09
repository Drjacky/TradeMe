package ir.hosseinabbasi.trademe.di.component;

import dagger.Component;
import ir.hosseinabbasi.trademe.di.PerActivity;
import ir.hosseinabbasi.trademe.di.module.ActivityModule;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
