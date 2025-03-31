package com.performance.module_1_151

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature151Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
