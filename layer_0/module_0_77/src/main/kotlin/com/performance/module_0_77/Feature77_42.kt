package com.performance.module_0_77

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature77Api0 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
