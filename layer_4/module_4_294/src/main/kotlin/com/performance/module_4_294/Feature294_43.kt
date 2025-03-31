package com.performance.module_4_294

import okhttp3.Interceptor
import okhttp3.Response

class Feature294Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
