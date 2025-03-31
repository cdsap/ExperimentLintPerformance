package com.performance.module_2_239

import okhttp3.Interceptor
import okhttp3.Response

class Feature239Interceptor0 : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}
