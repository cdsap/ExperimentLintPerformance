package com.performance.module_0_23

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature23Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
