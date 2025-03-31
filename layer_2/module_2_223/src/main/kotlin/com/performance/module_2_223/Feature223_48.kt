package com.performance.module_2_223

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature223Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
