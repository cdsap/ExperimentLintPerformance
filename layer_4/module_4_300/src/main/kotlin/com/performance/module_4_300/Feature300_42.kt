package com.performance.module_4_300

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature300Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
