package com.performance.module_1_30

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature30Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
