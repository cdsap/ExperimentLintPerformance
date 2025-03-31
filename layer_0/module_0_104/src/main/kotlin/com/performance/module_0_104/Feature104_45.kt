package com.performance.module_0_104

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature104Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
