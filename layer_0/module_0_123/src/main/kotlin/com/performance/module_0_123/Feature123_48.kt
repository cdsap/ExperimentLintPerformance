package com.performance.module_0_123

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature123Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
