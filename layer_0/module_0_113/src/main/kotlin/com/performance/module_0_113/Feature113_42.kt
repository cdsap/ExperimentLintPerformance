package com.performance.module_0_113

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature113Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
