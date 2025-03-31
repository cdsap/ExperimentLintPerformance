package com.performance.module_4_291

import okhttp3.Interceptor
import okhttp3.Response

class Feature291Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
