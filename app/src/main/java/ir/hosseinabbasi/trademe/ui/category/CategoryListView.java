package ir.hosseinabbasi.trademe.ui.category;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmList;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.di.ActivityContext;
import ir.hosseinabbasi.trademe.ui.base.BaseFragment;
import ir.hosseinabbasi.trademe.ui.main.MainActivity;

/**
 * Created by Dr.jacky on 3/14/2018.
 */

public class CategoryListView extends BaseFragment implements ICategoryListView {

    public static final String TAG = "CategoryListView";

    @Inject
    @ActivityContext
    Context mContext;

    @Inject
    CategoryListPresenter<CategoryListView> mPresenter;

    @BindView(R.id.fragment_category_RcyCategory)
    RecyclerView mCategoryRecyclerView;

    private CategoryAdapter mAdapter;

    public static CategoryListView getInstance(String parentNumber) {
        CategoryListView categoryListView = new CategoryListView();
        Bundle args = new Bundle();
        args.putString("parentNumber", parentNumber);
        categoryListView.setArguments(args);

        return categoryListView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this, view));
        mPresenter.onAttach(this);
        String parentNumber = getArguments().getString("parentNumber", "");
        initViews(parentNumber);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }

    private void initViews(String parentNumber) {
        RealmList<SubcategoriesItem> scList = null;

        if(parentNumber.isEmpty()) {
                Root rootRealm = mPresenter.getCategories();
                scList = rootRealm.getSubcategories();
        } else {
            SubcategoriesItem subRealm = mPresenter.getSubCatAt(parentNumber);
            if(subRealm != null)
                scList = subRealm.getSubcategories();
        }

        mCategoryRecyclerView.setHasFixedSize(true);
        mCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mAdapter = new CategoryAdapter(mContext, scList, this);
        mCategoryRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void getSubCategory(String parentNumber) {
        ((MainActivity)mContext).getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_main_FrmContainer, CategoryListView.getInstance(parentNumber), CategoryListView.TAG)
                .addToBackStack(null)
                .commit();
    }
}
