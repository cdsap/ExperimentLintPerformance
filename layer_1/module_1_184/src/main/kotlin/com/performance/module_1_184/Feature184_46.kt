package com.performance.module_1_184

import okhttp3.Interceptor
import okhttp3.Response

class Feature184Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
