package com.performance.module_2_133

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature133Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
