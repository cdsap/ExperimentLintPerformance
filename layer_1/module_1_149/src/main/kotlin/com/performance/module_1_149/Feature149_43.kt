package com.performance.module_1_149

import okhttp3.Interceptor
import okhttp3.Response

class Feature149Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
