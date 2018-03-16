package ir.hosseinabbasi.trademe.ui.search;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.search.ListItem;
import ir.hosseinabbasi.trademe.di.ActivityContext;
import ir.hosseinabbasi.trademe.ui.base.BaseFragment;

/**
 * Created by Dr.jacky on 2018/03/16.
 */

public class SearchResultView extends BaseFragment implements ISearchResultView {

    public static final String TAG = SearchResultView.class.getSimpleName();

    @Inject
    @ActivityContext
    Context mContext;

    @Inject
    SearchResultPresenter<SearchResultView> mPresenter;

    @BindView(R.id.fragment_search_result_RcyResult)
    RecyclerView mResultRecyclerView;

    private SearchResultAdapter mAdapter;

    public static SearchResultView getInstance(ArrayList<ListItem> listItems) {
        SearchResultView categoryListView = new SearchResultView();
        Bundle args = new Bundle();
        args.putParcelableArrayList("listItems", listItems);
        categoryListView.setArguments(args);

        return categoryListView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_result, container, false);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this, view));
        mPresenter.onAttach(this);
        ArrayList<ListItem> listItems = getArguments().getParcelableArrayList("listItems");
        initViews(listItems);
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

    private void initViews(ArrayList<ListItem> listItems) {
        mResultRecyclerView.setHasFixedSize(true);
        mResultRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mAdapter = new SearchResultAdapter(mContext, listItems, this);
        mResultRecyclerView.setAdapter(mAdapter);
    }
}
