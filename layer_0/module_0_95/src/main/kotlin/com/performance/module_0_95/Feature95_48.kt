package com.performance.module_0_95

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature95Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
