package com.performance.module_3_176

import okhttp3.Interceptor
import okhttp3.Response

class Feature176Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
