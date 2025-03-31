package com.performance.module_0_73

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature73Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
