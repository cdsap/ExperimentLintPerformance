package com.performance.module_1_187

import okhttp3.Interceptor
import okhttp3.Response

class Feature187Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
