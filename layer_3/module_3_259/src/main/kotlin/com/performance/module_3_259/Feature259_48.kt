package com.performance.module_3_259

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature259Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
