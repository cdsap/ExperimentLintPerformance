package com.performance.module_3_183

import okhttp3.Interceptor
import okhttp3.Response

class Feature183Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
