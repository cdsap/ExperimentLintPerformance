package com.performance.module_0_24

import okhttp3.Interceptor
import okhttp3.Response

class Feature24Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
