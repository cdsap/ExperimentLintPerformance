package com.performance.module_1_195

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature195Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
