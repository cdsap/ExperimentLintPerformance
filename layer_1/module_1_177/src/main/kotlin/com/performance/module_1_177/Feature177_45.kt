package com.performance.module_1_177

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature177Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
