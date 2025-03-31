package com.performance.module_1_159

import okhttp3.Interceptor
import okhttp3.Response

class Feature159Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
