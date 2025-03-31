package com.performance.module_2_221

import okhttp3.Interceptor
import okhttp3.Response

class Feature221Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
