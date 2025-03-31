package com.performance.module_0_64

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature64Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
