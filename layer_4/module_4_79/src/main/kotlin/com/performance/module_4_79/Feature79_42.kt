package com.performance.module_4_79

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature79Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
