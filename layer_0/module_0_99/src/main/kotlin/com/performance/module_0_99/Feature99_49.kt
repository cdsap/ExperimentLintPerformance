package com.performance.module_0_99

import okhttp3.Interceptor
import okhttp3.Response

class Feature99Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
