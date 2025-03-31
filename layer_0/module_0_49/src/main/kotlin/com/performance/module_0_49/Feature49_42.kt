package com.performance.module_0_49

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature49Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
