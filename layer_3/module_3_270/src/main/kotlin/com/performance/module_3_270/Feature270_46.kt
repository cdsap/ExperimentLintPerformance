package com.performance.module_3_270

import okhttp3.Interceptor
import okhttp3.Response

class Feature270Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
