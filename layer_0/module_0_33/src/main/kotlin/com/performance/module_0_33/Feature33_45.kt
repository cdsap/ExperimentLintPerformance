package com.performance.module_0_33

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature33Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
