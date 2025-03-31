package com.performance.module_0_74

import okhttp3.Interceptor
import okhttp3.Response

class Feature74Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
