package com.performance.module_2_210

import okhttp3.Interceptor
import okhttp3.Response

class Feature210Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
