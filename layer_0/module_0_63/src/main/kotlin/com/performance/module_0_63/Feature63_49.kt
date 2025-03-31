package com.performance.module_0_63

import okhttp3.Interceptor
import okhttp3.Response

class Feature63Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
