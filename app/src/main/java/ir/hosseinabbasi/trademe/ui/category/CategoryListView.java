package ir.hosseinabbasi.trademe.ui.category;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    public static CategoryListView getInstance() {
        return new CategoryListView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this, view));
        mPresenter.onAttach(this);
        initViews();
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

    private void initViews() {
        Root rootRealm = mPresenter.getCategories();
        RealmList<SubcategoriesItem> scList = rootRealm.getSubcategories();
        mCategoryRecyclerView.setHasFixedSize(true);
        mCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mCategoryRecyclerView.setAdapter(new CategoryAdapter(mContext, scList, null));
    }

}
