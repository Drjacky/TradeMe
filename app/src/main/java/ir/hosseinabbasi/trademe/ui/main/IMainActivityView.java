package ir.hosseinabbasi.trademe.ui.main;

import ir.hosseinabbasi.trademe.data.db.model.search.Search;
import ir.hosseinabbasi.trademe.ui.base.IBaseView;

/**
 * Created by Dr.jacky on 3/12/2018.
 */

public interface IMainActivityView extends IBaseView{
    void loadSearchResult(Search result);
}
