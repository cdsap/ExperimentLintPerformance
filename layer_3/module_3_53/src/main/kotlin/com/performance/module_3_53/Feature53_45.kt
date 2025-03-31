package com.performance.module_3_53

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature53Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
