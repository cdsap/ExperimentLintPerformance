package com.performance.module_4_277

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature277Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
