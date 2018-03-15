package ir.hosseinabbasi.trademe.data.network;

import io.reactivex.Observable;
import ir.hosseinabbasi.trademe.data.db.model.Root;
import ir.hosseinabbasi.trademe.data.db.model.listing.Listing;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface IApiService {
    @GET("Categories/{number}.{file_format}")
    Observable<Root> getCategories(@Path("number") String number, @Path("file_format") String fileFormat);

    @GET("Listings/{listingId}.{file_format}")
    Observable<Listing> getDetail(@Path("listingId") String listingId, @Path("file_format") String fileFormat);
}
