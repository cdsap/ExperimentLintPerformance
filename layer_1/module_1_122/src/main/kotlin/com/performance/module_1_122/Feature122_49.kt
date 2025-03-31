package com.performance.module_1_122

import okhttp3.Interceptor
import okhttp3.Response

class Feature122Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
