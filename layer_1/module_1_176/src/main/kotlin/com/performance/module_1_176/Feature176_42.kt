package com.performance.module_1_176

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature176Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
