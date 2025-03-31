package com.performance.module_2_138

import okhttp3.Interceptor
import okhttp3.Response

class Feature138Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
