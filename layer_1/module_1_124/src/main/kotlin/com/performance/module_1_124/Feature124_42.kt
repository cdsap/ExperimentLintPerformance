package com.performance.module_1_124

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature124Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
