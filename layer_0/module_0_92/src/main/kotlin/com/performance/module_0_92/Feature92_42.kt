package com.performance.module_0_92

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature92Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
