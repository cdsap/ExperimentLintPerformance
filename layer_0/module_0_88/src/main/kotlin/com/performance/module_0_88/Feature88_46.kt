package com.performance.module_0_88

import okhttp3.Interceptor
import okhttp3.Response

class Feature88Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
