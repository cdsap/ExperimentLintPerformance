package com.performance.module_1_160

import okhttp3.Interceptor
import okhttp3.Response

class Feature160Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
