package com.performance.module_4_283

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature283Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
