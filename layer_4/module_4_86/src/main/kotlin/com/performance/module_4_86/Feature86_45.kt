package com.performance.module_4_86

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature86Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
