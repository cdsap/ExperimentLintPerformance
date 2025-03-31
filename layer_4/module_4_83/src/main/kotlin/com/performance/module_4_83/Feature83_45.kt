package com.performance.module_4_83

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature83Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
