package com.performance.module_1_188

import okhttp3.Interceptor
import okhttp3.Response

class Feature188Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
