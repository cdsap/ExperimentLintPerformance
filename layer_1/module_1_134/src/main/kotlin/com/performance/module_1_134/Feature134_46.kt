package com.performance.module_1_134

import okhttp3.Interceptor
import okhttp3.Response

class Feature134Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
