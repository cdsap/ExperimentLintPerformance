package com.performance.module_3_66

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature66Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
