package com.performance.module_0_46

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature46Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
