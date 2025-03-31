package com.performance.module_2_221

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature221Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
