package com.performance.module_0_91

import okhttp3.Interceptor
import okhttp3.Response

class Feature91Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
