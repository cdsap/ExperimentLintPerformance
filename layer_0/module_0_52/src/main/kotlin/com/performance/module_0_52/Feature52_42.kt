package com.performance.module_0_52

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature52Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
