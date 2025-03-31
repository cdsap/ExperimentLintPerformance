package com.performance.module_5_301

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature301Api2 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
