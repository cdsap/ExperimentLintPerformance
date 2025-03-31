package com.performance.module_4_198

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature198Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
