package com.performance.module_0_69

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature69Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
