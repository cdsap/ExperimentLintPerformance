package com.performance.module_5_201

import okhttp3.Interceptor
import okhttp3.Response

class Feature201Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
