package com.performance.module_1_25

import okhttp3.Interceptor
import okhttp3.Response

class Feature25Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
