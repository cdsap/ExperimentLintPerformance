package com.performance.module_1_165

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature165Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
