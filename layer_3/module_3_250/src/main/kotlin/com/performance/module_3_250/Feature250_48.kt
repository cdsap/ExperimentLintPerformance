package com.performance.module_3_250

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature250Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
