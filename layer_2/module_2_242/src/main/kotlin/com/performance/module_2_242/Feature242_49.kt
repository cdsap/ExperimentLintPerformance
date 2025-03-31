package com.performance.module_2_242

import okhttp3.Interceptor
import okhttp3.Response

class Feature242Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
