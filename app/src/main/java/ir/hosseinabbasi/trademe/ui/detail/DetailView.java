package ir.hosseinabbasi.trademe.ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
 * Created by Dr.jacky on 2018/03/15.
 */

public class DetailView extends BaseFragment implements IDetailView {

    public static final String TAG = DetailView.class.getSimpleName();

    @Inject
    @ActivityContext
    Context mContext;

    @Inject
    DetailPresenter<DetailView> mPresenter;

    public static DetailView getInstance(String listingId) {
        DetailView detailView = new DetailView();
        Bundle args = new Bundle();
        args.putString("listingId", listingId);
        detailView.setArguments(args);

        return detailView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this, view));
        mPresenter.onAttach(this);
        String listingId = getArguments().getString("listingId", "");
        initViews(listingId);
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

    private void initViews(String listingId) {
        RealmList<SubcategoriesItem> scList = null;

        if(!listingId.isEmpty()) {

        }
    }
}
