package com.performance.module_1_146

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature146Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
