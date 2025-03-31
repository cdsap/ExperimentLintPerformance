package com.performance.module_3_268

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature268Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
