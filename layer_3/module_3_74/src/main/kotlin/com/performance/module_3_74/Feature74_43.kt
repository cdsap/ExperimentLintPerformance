package com.performance.module_3_74

import okhttp3.Interceptor
import okhttp3.Response

class Feature74Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
