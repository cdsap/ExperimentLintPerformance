package com.performance.module_3_177

import okhttp3.Interceptor
import okhttp3.Response

class Feature177Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
