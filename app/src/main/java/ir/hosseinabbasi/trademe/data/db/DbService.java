package ir.hosseinabbasi.trademe.data.db;

import android.support.annotation.NonNull;
import android.util.Log;

import javax.inject.Inject;

import io.realm.Realm;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.RootFields;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItem;
import ir.hosseinabbasi.trademe.data.db.model.SubcategoriesItemFields;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class DbService implements IDbService {

    private final RealmManager mRealmManager;

    @Inject
    public DbService(RealmManager realmManager) {
        this.mRealmManager = realmManager;
    }

    @Override
    public Root loadCategories() {
        Realm realm = mRealmManager.getLocalInstance();
        return realm.where(Root.class).findFirst();
    }

    @Override
    public void saveCategories(Root root) {
        Realm realm = mRealmManager.getLocalInstance();
        realm.executeTransaction(realm1 -> realm1.insertOrUpdate(root));
    }

    @Override
    public Root loadSubCatAt(String parentNumber) {
        Realm realm = mRealmManager.getLocalInstance();
        return realm.where(Root.class).beginsWith(RootFields.NUMBER, parentNumber).findFirst(); //ToDo
    }

}
