package com.performance.module_1_196

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature196Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
