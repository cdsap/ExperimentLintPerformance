package com.performance.module_0_80

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature80Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
