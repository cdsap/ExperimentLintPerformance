package com.performance.module_2_219

import okhttp3.Interceptor
import okhttp3.Response

class Feature219Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
