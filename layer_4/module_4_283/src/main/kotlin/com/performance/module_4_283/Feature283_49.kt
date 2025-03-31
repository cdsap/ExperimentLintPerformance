package com.performance.module_4_283

import okhttp3.Interceptor
import okhttp3.Response

class Feature283Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
