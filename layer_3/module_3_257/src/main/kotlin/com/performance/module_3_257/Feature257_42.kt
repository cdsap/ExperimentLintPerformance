package com.performance.module_3_257

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature257Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
