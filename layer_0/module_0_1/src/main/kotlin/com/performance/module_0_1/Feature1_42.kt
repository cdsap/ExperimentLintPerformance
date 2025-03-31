package com.performance.module_0_1

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature1Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
