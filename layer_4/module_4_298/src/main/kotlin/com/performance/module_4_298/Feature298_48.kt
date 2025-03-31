package com.performance.module_4_298

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature298Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
