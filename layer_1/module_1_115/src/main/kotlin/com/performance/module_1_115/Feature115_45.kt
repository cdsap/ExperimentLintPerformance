package com.performance.module_1_115

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature115Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
