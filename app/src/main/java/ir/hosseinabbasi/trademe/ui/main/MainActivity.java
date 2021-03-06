package ir.hosseinabbasi.trademe.ui.main;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.ButterKnife;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.search.ListItem;
import ir.hosseinabbasi.trademe.data.db.model.search.Search;
import ir.hosseinabbasi.trademe.ui.base.BaseActivity;
import ir.hosseinabbasi.trademe.ui.category.CategoryListView;
import ir.hosseinabbasi.trademe.ui.search.SearchResultView;

/**
 * Created by Dr.jacky on 3/12/2018.
 */

public class MainActivity extends BaseActivity implements IMainActivityView {

    public static final String TAG = MainActivity.class.getSimpleName();

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

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem search = menu.findItem(R.id.main_search);
        final SearchView searchView = (SearchView) search.getActionView();
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.setIconified(true);
                searchView.clearFocus();
                mPresenter.getSearchResult(query);
                (menu.findItem(R.id.main_search)).collapseActionView();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        searchView.setIconified(false);

        return true;
    }

    @Override
    public void loadSearchResult(Search result) {
        ArrayList<ListItem> listItems = result.getList();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_main_FrmContainer, SearchResultView.getInstance(listItems), SearchResultView.TAG)
                .addToBackStack(null)
                .commit();
    }
}
