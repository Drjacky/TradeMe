package ir.hosseinabbasi.trademe.data;

import io.reactivex.Observable;
import ir.hosseinabbasi.trademe.data.db.IDbService;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.data.network.IApiService;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface DataManager extends IApiService, IDbService {
    @Override
    Observable<Root> getCategories(String number, String fileFormat);

    @Override
    Root loadCategories();

    @Override
    void saveCategories(Root root);

    @Override
    SubcategoriesItem loadSubCatAt(String parentNumber);
}
