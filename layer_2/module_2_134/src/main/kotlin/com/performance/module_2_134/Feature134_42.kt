package com.performance.module_2_134

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature134Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
