package com.performance.module_3_59

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature59Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
