package com.performance.module_3_266

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature266Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
