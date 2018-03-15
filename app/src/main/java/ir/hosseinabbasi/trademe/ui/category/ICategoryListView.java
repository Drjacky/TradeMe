package ir.hosseinabbasi.trademe.ui.category;

import ir.hosseinabbasi.trademe.ui.base.IBaseView;

/**
 * Created by Dr.jacky on 3/14/2018.
 */

public interface ICategoryListView extends IBaseView{
    void getSubCategory(String parentNumber);
    void getDetail(String listingId); //It was also possible that handle it by just an If condition inside of getSubCategory method.
}
