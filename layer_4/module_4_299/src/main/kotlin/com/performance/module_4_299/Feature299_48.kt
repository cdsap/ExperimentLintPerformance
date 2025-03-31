package com.performance.module_4_299

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature299Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
