package com.performance.module_4_284

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature284Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
