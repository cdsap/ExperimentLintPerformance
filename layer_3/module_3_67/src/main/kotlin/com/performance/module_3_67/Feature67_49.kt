package com.performance.module_3_67

import okhttp3.Interceptor
import okhttp3.Response

class Feature67Interceptor2 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
