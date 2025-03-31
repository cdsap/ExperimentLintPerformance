package com.performance.module_0_17

import okhttp3.Interceptor
import okhttp3.Response

class Feature17Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
