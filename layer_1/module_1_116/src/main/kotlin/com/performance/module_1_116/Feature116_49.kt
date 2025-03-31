package com.performance.module_1_116

import okhttp3.Interceptor
import okhttp3.Response

class Feature116Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
