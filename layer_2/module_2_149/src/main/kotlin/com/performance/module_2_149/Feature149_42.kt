package com.performance.module_2_149

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature149Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
