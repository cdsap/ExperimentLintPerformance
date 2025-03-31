package com.performance.module_2_223

import okhttp3.Interceptor
import okhttp3.Response

class Feature223Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
