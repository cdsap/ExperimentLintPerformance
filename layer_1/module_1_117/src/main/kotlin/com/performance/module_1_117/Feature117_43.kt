package com.performance.module_1_117

import okhttp3.Interceptor
import okhttp3.Response

class Feature117Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
