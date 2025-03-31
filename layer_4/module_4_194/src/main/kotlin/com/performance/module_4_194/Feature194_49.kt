package com.performance.module_4_194

import okhttp3.Interceptor
import okhttp3.Response

class Feature194Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
