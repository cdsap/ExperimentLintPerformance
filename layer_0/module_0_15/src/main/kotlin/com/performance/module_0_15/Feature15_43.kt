package com.performance.module_0_15

import okhttp3.Interceptor
import okhttp3.Response

class Feature15Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
