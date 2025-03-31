package com.performance.module_1_93

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature93Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
