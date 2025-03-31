package com.performance.module_0_40

import okhttp3.Interceptor
import okhttp3.Response

class Feature40Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
