package com.performance.module_3_169

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature169Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
