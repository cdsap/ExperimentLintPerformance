package com.performance.module_3_259

import okhttp3.Interceptor
import okhttp3.Response

class Feature259Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
