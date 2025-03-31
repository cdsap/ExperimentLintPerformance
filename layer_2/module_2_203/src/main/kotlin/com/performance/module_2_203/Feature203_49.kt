package com.performance.module_2_203

import okhttp3.Interceptor
import okhttp3.Response

class Feature203Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
