package com.performance.module_2_142

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature142Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
