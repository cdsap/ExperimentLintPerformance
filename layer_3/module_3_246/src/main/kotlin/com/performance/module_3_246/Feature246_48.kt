package com.performance.module_3_246

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature246Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
