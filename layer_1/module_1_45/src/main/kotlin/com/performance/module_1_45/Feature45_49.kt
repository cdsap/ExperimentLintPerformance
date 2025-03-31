package com.performance.module_1_45

import okhttp3.Interceptor
import okhttp3.Response

class Feature45Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
