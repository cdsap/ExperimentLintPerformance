package com.performance.module_3_264

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature264Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
