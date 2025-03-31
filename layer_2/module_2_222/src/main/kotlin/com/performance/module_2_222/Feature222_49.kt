package com.performance.module_2_222

import okhttp3.Interceptor
import okhttp3.Response

class Feature222Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
