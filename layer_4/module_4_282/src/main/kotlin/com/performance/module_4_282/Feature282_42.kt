package com.performance.module_4_282

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature282Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
