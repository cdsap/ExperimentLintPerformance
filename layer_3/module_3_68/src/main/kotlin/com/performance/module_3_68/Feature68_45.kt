package com.performance.module_3_68

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature68Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
