package com.performance.module_1_94

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature94Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
