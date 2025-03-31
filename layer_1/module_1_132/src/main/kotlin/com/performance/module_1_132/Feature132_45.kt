package com.performance.module_1_132

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature132Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
