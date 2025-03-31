package com.performance.module_0_14

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature14Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
