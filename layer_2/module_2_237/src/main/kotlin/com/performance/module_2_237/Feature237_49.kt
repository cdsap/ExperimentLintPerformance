package com.performance.module_2_237

import okhttp3.Interceptor
import okhttp3.Response

class Feature237Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
