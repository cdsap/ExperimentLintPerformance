package com.performance.module_2_234

import okhttp3.Interceptor
import okhttp3.Response

class Feature234Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
