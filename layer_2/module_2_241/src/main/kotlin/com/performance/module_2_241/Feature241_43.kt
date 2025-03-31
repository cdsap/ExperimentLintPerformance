package com.performance.module_2_241

import okhttp3.Interceptor
import okhttp3.Response

class Feature241Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
