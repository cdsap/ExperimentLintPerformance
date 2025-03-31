package com.performance.module_2_209

import okhttp3.Interceptor
import okhttp3.Response

class Feature209Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
