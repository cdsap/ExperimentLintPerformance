package com.performance.module_1_178

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature178Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
