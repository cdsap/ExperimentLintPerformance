package com.performance.module_2_138

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature138Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
