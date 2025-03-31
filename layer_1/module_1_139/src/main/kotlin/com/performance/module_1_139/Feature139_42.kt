package com.performance.module_1_139

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature139Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
