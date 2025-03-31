package com.performance.module_0_45

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature45Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
