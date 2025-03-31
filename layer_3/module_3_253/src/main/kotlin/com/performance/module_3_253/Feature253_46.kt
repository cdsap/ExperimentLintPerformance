package com.performance.module_3_253

import okhttp3.Interceptor
import okhttp3.Response

class Feature253Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
