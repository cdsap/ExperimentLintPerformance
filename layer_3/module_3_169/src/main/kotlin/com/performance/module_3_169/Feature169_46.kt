package com.performance.module_3_169

import okhttp3.Interceptor
import okhttp3.Response

class Feature169Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
