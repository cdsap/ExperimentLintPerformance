package com.performance.module_2_216

import okhttp3.Interceptor
import okhttp3.Response

class Feature216Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
