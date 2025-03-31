package com.performance.module_3_51

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature51Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
