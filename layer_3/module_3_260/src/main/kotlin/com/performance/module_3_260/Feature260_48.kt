package com.performance.module_3_260

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature260Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
