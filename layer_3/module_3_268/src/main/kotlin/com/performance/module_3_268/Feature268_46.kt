package com.performance.module_3_268

import okhttp3.Interceptor
import okhttp3.Response

class Feature268Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
