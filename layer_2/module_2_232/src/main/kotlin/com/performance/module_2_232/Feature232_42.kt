package com.performance.module_2_232

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature232Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
