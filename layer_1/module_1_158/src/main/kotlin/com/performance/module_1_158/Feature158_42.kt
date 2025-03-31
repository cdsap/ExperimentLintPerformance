package com.performance.module_1_158

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature158Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
