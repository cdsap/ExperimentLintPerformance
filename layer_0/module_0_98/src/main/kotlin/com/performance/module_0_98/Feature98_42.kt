package com.performance.module_0_98

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature98Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
