package com.performance.module_1_106

import okhttp3.Interceptor
import okhttp3.Response

class Feature106Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
