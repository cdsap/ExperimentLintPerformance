package com.performance.module_1_89

import okhttp3.Interceptor
import okhttp3.Response

class Feature89Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
