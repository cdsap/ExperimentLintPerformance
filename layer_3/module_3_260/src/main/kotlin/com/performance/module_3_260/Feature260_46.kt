package com.performance.module_3_260

import okhttp3.Interceptor
import okhttp3.Response

class Feature260Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
