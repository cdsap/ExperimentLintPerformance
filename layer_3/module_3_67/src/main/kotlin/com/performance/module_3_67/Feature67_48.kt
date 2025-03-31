package com.performance.module_3_67

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature67Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
