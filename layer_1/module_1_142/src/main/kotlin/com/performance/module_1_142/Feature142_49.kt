package com.performance.module_1_142

import okhttp3.Interceptor
import okhttp3.Response

class Feature142Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
