package com.performance.module_0_130

import okhttp3.Interceptor
import okhttp3.Response

class Feature130Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
