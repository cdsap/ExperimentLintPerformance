package com.performance.module_3_180

import okhttp3.Interceptor
import okhttp3.Response

class Feature180Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
