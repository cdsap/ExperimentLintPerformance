package com.performance.module_1_112

import okhttp3.Interceptor
import okhttp3.Response

class Feature112Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
