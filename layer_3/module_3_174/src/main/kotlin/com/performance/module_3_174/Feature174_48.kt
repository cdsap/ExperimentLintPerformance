package com.performance.module_3_174

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature174Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
