package com.performance.module_3_248

import okhttp3.Interceptor
import okhttp3.Response

class Feature248Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
