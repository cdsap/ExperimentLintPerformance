package com.performance.module_0_28

import okhttp3.Interceptor
import okhttp3.Response

class Feature28Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
