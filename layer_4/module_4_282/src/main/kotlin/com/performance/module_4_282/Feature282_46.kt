package com.performance.module_4_282

import okhttp3.Interceptor
import okhttp3.Response

class Feature282Interceptor1 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
