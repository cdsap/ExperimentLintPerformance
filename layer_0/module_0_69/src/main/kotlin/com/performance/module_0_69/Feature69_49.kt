package com.performance.module_0_69

import okhttp3.Interceptor
import okhttp3.Response

class Feature69Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
