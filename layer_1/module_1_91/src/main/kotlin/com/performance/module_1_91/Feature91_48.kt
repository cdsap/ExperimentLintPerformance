package com.performance.module_1_91

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature91Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
