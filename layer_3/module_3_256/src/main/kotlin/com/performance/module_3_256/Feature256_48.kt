package com.performance.module_3_256

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature256Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
