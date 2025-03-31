package com.performance.module_1_171

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature171Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
