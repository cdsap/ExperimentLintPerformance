package com.performance.module_3_178

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature178Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
