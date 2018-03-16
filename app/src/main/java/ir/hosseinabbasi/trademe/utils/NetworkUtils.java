package ir.hosseinabbasi.trademe.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import ir.hosseinabbasi.trademe.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public class NetworkUtils {
    private NetworkUtils() {
        // This utility class is not publicly instantiable
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }

    public static OkHttpClient.Builder getCustomRetrofitHeader() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(chain -> {
            String value = "OAuth oauth_consumer_key=\"" + BuildConfig.CONSUMER_KEY + "\", oauth_signature_method=\"PLAINTEXT\", oauth_signature=\"" + BuildConfig.CONSUMER_SECRET + "&\"";
            Request original = chain.request();

            Request.Builder requestBuilder = original.newBuilder()
                    .addHeader("Authorization", value);

            Request request = requestBuilder.build();
            return chain.proceed(request);
        });

        return httpClient;
    }
}
