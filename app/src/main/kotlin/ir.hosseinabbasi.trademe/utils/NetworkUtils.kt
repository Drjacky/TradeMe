package ir.hosseinabbasi.trademe.utils

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import ir.hosseinabbasi.trademe.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Dr.jacky on 2018/03/24.
 */

class NetworkUtils constructor(){

    companion object {
        fun isNetworkConnected(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting
        }

        fun getCustomRetrofitHeader(): OkHttpClient.Builder {
            val httpClient = OkHttpClient.Builder()
            httpClient.addInterceptor({ chain ->
                val value = "OAuth oauth_consumer_key=\"" + BuildConfig.CONSUMER_KEY + "\", oauth_signature_method=\"PLAINTEXT\", oauth_signature=\"" + BuildConfig.CONSUMER_SECRET + "&\""
                val original = chain.request()

                val requestBuilder = original.newBuilder()
                        .addHeader("Authorization", value)

                val request = requestBuilder.build()
                chain.proceed(request)
            })

            return httpClient
        }
    }
}