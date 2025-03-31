package com.performance.module_0_13

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature13Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
