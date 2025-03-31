package com.performance.module_4_85

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature85Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
