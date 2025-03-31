package com.performance.module_0_23

import okhttp3.Interceptor
import okhttp3.Response

class Feature23Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
