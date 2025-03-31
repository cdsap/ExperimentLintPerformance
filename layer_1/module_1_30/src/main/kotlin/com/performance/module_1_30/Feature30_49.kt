package com.performance.module_1_30

import okhttp3.Interceptor
import okhttp3.Response

class Feature30Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
