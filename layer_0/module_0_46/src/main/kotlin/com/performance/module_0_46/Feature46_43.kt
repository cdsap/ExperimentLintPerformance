package com.performance.module_0_46

import okhttp3.Interceptor
import okhttp3.Response

class Feature46Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
