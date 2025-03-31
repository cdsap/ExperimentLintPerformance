package com.performance.module_3_164

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature164Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
