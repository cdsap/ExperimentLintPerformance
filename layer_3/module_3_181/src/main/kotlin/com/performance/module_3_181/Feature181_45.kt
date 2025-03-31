package com.performance.module_3_181

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature181Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
