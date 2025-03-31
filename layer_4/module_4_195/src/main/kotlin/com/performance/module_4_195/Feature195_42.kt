package com.performance.module_4_195

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature195Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
