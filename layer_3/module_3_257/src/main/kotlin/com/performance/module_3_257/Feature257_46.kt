package com.performance.module_3_257

import okhttp3.Interceptor
import okhttp3.Response

class Feature257Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
