package com.performance.module_1_34

import okhttp3.Interceptor
import okhttp3.Response

class Feature34Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
