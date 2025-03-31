package com.performance.module_3_274

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature274Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
