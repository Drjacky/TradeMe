package ir.hosseinabbasi.trademe.data.db;

import io.realm.Realm;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class RealmManager {
    private final ThreadLocal<Realm> localRealms = new ThreadLocal<>();

    public Realm openLocalInstance() {
        checkDefaultConfiguration();
        Realm realm = Realm.getDefaultInstance(); // <-- consider adding parameter and Map<RealmConfiguration, ...>
        Realm localRealm = localRealms.get();
        if(localRealm == null || localRealm.isClosed()) {
            localRealms.set(realm);
        }
        return realm;
    }

    public Realm getLocalInstance() {
        Realm realm = localRealms.get();
        if(realm == null || realm.isClosed()) {
            throw new IllegalStateException(
                    "No open Realms were found on this thread.");
        }
        return realm;
    }

    public void closeLocalInstance() {
        checkDefaultConfiguration();
        Realm realm = localRealms.get();
        if(realm == null || realm.isClosed()) {
            throw new IllegalStateException(
                    "Cannot close a Realm that is not open.");
        }
        realm.close();
        // noinspection ConstantConditions
        if(Realm.getLocalInstanceCount(Realm.getDefaultConfiguration()) <= 0) {
            localRealms.set(null);
        }
    }

    private void checkDefaultConfiguration() {
        if(Realm.getDefaultConfiguration() == null) {
            throw new IllegalStateException("No default configuration is set.");
        }
    }
}
