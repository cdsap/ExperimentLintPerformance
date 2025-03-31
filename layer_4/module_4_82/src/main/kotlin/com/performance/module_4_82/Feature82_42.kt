package com.performance.module_4_82

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature82Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
