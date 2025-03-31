package com.performance.module_1_111

import okhttp3.Interceptor
import okhttp3.Response

class Feature111Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
