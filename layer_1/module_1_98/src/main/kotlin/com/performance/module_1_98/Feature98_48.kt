package com.performance.module_1_98

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature98Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
