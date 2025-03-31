package com.performance.module_0_70

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature70Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
