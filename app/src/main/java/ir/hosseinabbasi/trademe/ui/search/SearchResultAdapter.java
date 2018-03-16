package ir.hosseinabbasi.trademe.ui.search;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.search.ListItem;
import ir.hosseinabbasi.trademe.databinding.SearchResultListItemBinding;

/**
 * Created by Dr.jacky on 2018/03/16.
 */

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.DataHolder> {

    private Context mContext;
    private ISearchResultView mListener;
    private ArrayList<ListItem> mListItems;

    public SearchResultAdapter(Context context, ArrayList<ListItem> items, ISearchResultView listener) {
        mContext = context;
        mListItems = items;
        mListener = listener;
    }

    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        SearchResultListItemBinding bind = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.search_result_list_item, parent, false);

        return new DataHolder(bind);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        ListItem listItemModel = mListItems.get(holder.getAdapterPosition());
        holder.bind(listItemModel);
    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    class DataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.search_result_list_item_cnsMain)
        ConstraintLayout row;

        SearchResultListItemBinding searchResultListItemBinding;

        DataHolder(SearchResultListItemBinding binding) {
            super(binding.getRoot());
            searchResultListItemBinding = binding;
            ButterKnife.bind(this, binding.getRoot());
        }

        public void bind(@NonNull ListItem item) {
            searchResultListItemBinding.setSearchListItemModel(item);
            row.setOnClickListener(this);
            searchResultListItemBinding.executePendingBindings();
        }

        @Override
        public void onClick(View view) {
            ListItem item = mListItems.get(getAdapterPosition());
            Log.wtf("SearchResultAdapter", item.getTitle());
        }

    }
}
