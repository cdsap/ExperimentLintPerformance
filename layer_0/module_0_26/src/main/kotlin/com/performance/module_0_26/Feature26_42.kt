package com.performance.module_0_26

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature26Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
