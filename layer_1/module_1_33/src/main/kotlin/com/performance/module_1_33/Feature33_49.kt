package com.performance.module_1_33

import okhttp3.Interceptor
import okhttp3.Response

class Feature33Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
