package com.performance.module_1_192

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature192Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
