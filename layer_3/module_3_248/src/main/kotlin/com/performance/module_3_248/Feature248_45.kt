package com.performance.module_3_248

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature248Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
