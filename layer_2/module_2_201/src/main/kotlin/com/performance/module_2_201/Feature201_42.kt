package com.performance.module_2_201

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature201Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
