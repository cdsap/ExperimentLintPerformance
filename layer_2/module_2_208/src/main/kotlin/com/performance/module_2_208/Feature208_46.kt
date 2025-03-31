package com.performance.module_2_208

import okhttp3.Interceptor
import okhttp3.Response

class Feature208Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
