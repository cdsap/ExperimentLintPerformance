package com.performance.module_2_211

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature211Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
