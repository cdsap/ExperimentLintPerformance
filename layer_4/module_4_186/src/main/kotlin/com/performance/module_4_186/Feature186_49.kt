package com.performance.module_4_186

import okhttp3.Interceptor
import okhttp3.Response

class Feature186Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
