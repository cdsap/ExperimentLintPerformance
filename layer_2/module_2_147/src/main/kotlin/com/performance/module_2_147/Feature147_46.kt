package com.performance.module_2_147

import okhttp3.Interceptor
import okhttp3.Response

class Feature147Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
