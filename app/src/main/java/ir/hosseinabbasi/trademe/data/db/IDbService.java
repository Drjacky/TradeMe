package ir.hosseinabbasi.trademe.data.db;

import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface IDbService {
    Root loadCategories();
    void saveCategories(Root root);
    SubcategoriesItem loadSubCatAt(String parentNumber);
}
