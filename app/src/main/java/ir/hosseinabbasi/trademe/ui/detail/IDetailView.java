package ir.hosseinabbasi.trademe.ui.detail;

import ir.hosseinabbasi.trademe.data.db.model.listing.Listing;
import ir.hosseinabbasi.trademe.ui.base.IBaseView;

/**
 * Created by Dr.jacky on 2018/03/15.
 */

public interface IDetailView extends IBaseView {
    void loadDetail(Listing detail);
}
