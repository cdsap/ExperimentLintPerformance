package com.performance.module_2_240

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature240Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
