package com.performance.module_4_296

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature296Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
