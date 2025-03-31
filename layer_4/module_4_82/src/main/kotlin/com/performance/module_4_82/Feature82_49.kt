package com.performance.module_4_82

import okhttp3.Interceptor
import okhttp3.Response

class Feature82Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
