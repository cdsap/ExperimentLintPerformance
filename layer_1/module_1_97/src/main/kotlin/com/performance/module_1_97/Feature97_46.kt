package com.performance.module_1_97

import okhttp3.Interceptor
import okhttp3.Response

class Feature97Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
