package com.performance.module_4_190

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature190Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
