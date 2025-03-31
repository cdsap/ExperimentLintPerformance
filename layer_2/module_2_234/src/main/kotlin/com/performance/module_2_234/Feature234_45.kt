package com.performance.module_2_234

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature234Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
