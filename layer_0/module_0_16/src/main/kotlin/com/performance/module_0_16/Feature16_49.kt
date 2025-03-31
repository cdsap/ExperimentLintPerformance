package com.performance.module_0_16

import okhttp3.Interceptor
import okhttp3.Response

class Feature16Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
