package com.performance.module_5_201

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature201Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
