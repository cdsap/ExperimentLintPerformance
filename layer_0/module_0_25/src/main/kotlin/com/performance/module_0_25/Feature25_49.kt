package com.performance.module_0_25

import okhttp3.Interceptor
import okhttp3.Response

class Feature25Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
