package com.performance.module_1_119

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature119Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
