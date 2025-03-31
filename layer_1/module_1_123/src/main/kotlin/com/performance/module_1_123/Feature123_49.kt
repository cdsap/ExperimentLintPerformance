package com.performance.module_1_123

import okhttp3.Interceptor
import okhttp3.Response

class Feature123Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
