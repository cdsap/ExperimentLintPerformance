package com.performance.module_1_37

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature37Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
