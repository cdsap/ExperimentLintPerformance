package com.performance.module_0_103

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature103Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
