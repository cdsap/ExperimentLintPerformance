package com.performance.module_1_165

import okhttp3.Interceptor
import okhttp3.Response

class Feature165Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
