package com.performance.module_2_212

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature212Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
