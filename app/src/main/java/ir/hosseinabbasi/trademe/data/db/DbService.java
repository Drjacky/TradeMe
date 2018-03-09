package ir.hosseinabbasi.trademe.data.db;

import javax.inject.Inject;

import ir.hosseinabbasi.trademe.data.db.RealmManager;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class DbService implements IDbService {

    private final RealmManager mRealmManager;

    @Inject
    public DbService(RealmManager realmManager) {
        this.mRealmManager = realmManager;
    }
}
