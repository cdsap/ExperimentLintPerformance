package com.performance.module_3_73

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature73Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
