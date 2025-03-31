package com.performance.module_0_19

import okhttp3.Interceptor
import okhttp3.Response

class Feature19Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
