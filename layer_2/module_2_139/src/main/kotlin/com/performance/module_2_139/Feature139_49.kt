package com.performance.module_2_139

import okhttp3.Interceptor
import okhttp3.Response

class Feature139Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
