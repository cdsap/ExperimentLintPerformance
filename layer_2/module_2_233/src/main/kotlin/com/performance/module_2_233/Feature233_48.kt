package com.performance.module_2_233

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature233Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
