package com.performance.module_2_232

import okhttp3.Interceptor
import okhttp3.Response

class Feature232Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
