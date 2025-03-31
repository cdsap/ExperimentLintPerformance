package com.performance.module_3_269

import okhttp3.Interceptor
import okhttp3.Response

class Feature269Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
