package ir.hosseinabbasi.trademe.ui.main;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import io.realm.RealmList;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.ui.base.BaseActivity;
import ir.hosseinabbasi.trademe.ui.category.CategoryAdapter;
import ir.hosseinabbasi.trademe.ui.category.CategoryListView;

/**
 * Created by Dr.jacky on 3/12/2018.
 */

public class MainActivity extends BaseActivity implements IMainActivityView {

    @Inject
    IMainActivityPresenter<IMainActivityView> mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(this);
        initViews();
    }

    @Override
    public void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    private void initViews() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_main_FrmContainer, CategoryListView.getInstance(""), CategoryListView.TAG)
                .commit();
    }

}
