package com.performance.module_3_263

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature263Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
