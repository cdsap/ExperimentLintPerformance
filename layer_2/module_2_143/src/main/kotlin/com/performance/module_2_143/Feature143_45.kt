package com.performance.module_2_143

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature143Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
