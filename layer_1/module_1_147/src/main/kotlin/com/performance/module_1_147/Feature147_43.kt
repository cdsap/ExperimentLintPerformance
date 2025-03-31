package com.performance.module_1_147

import okhttp3.Interceptor
import okhttp3.Response

class Feature147Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
