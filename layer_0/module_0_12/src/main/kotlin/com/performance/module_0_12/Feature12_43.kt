package com.performance.module_0_12

import okhttp3.Interceptor
import okhttp3.Response

class Feature12Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
