package com.performance.module_1_164

import okhttp3.Interceptor
import okhttp3.Response

class Feature164Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
