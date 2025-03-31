package com.performance.module_2_242

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature242Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
