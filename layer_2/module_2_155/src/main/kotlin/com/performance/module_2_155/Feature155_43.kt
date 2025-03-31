package com.performance.module_2_155

import okhttp3.Interceptor
import okhttp3.Response

class Feature155Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
