package com.performance.module_4_200

import okhttp3.Interceptor
import okhttp3.Response

class Feature200Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
