package com.performance.module_0_9

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature9Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
