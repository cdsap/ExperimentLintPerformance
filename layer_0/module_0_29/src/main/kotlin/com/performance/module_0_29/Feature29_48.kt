package com.performance.module_0_29

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature29Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
