package com.performance.module_2_237

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature237Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
