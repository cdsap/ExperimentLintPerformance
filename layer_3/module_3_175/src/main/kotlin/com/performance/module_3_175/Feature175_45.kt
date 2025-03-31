package com.performance.module_3_175

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature175Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
