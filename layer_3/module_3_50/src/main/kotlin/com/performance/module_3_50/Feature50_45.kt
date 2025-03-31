package com.performance.module_3_50

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature50Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
