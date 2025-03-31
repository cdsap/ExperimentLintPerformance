package com.performance.module_0_35

import okhttp3.Interceptor
import okhttp3.Response

class Feature35Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
