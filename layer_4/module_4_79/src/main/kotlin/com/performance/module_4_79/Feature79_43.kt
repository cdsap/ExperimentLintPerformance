package com.performance.module_4_79

import okhttp3.Interceptor
import okhttp3.Response

class Feature79Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
