package com.performance.module_1_188

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature188Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
