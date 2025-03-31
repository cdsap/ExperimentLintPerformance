package com.performance.module_0_132

import okhttp3.Interceptor
import okhttp3.Response

class Feature132Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
