package com.performance.module_4_295

import okhttp3.Interceptor
import okhttp3.Response

class Feature295Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
