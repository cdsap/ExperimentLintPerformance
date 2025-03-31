package com.performance.module_4_281

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature281Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
