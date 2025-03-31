package com.performance.module_4_284

import okhttp3.Interceptor
import okhttp3.Response

class Feature284Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
