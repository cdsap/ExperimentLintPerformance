package com.performance.module_4_286

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature286Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
