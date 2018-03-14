package ir.hosseinabbasi.trademe.ui.category;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.hosseinabbasi.trademe.R;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.databinding.CategoryListItemBinding;
import ir.hosseinabbasi.trademe.ui.main.IMainActivityView;

/**
 * Created by Dr.jacky on 3/12/2018.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.DataHolder> {

    private Context mContext;
    private ICategoryListView mListener;
    private List<SubcategoriesItem> mSubcategoriesItems;

    public CategoryAdapter(Context context, List<SubcategoriesItem> items, ICategoryListView listener) {
        mContext = context;
        mSubcategoriesItems = items;
        mListener = listener;
    }

    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CategoryListItemBinding bind = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.category_list_item, parent, false);

        return new DataHolder(bind);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        SubcategoriesItem homeProductSliderModel = mSubcategoriesItems.get(holder.getAdapterPosition());
        holder.bind(homeProductSliderModel);
    }

    @Override
    public int getItemCount() {
        return mSubcategoriesItems.size();
    }

    public void addAll(List<SubcategoriesItem> scList) {
        mSubcategoriesItems = scList;
        notifyDataSetChanged();
    }

    class DataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.category_list_item_cnsMain)
        ConstraintLayout row;

        CategoryListItemBinding activityMainBinding;

        DataHolder(CategoryListItemBinding binding) {
            super(binding.getRoot());
            activityMainBinding = binding;
            ButterKnife.bind(this, binding.getRoot());
        }

        public void bind(@NonNull SubcategoriesItem scItem) { //ToDo Use Object, to make the usage of the Adapter general.
            activityMainBinding.setSubcategoriesItemModel(scItem);
            row.setOnClickListener(this);
            activityMainBinding.executePendingBindings();
        }

        @Override
        public void onClick(View view) {
            SubcategoriesItem sc = mSubcategoriesItems.get(getAdapterPosition());
            mListener.getSubCategory(sc.getNumber());
        }

    }
}
