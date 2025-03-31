package com.performance.module_0_15

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature15Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
