package com.performance.module_1_192

import okhttp3.Interceptor
import okhttp3.Response

class Feature192Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
