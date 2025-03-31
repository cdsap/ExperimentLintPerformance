package com.performance.module_0_101

import okhttp3.Interceptor
import okhttp3.Response

class Feature101Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
