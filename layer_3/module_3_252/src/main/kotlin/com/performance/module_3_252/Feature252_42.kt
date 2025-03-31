package com.performance.module_3_252

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature252Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
