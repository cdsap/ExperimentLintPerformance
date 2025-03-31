package com.performance.module_1_89

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature89Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
