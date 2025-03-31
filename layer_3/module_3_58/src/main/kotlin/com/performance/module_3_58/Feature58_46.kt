package com.performance.module_3_58

import okhttp3.Interceptor
import okhttp3.Response

class Feature58Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
