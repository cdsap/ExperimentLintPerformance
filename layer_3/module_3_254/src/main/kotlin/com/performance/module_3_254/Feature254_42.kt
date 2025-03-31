package com.performance.module_3_254

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature254Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
