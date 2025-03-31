package com.performance.module_3_168

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature168Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
