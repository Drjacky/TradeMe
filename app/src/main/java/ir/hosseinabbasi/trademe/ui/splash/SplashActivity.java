package ir.hosseinabbasi.trademe.ui.splash;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.ButterKnife;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.ui.base.BaseActivity;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class SplashActivity extends BaseActivity implements ISplashView{

    @Inject
    ISplashPresenter<ISplashView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(SplashActivity.this);

        getCategories();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    private void getCategories() {
        if(isNetworkConnected())
            mPresenter.getCategories();
        else
            Toast.makeText(this, R.string.error_general, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadCategoryList(Root categoryList) {

    }
}
