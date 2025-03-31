package com.performance.module_0_125

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature125Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
