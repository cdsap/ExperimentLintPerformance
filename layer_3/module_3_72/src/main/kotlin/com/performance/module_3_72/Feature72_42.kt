package com.performance.module_3_72

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature72Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
