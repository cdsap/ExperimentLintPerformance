package com.performance.module_0_30

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature30Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
