package com.performance.module_0_109

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature109Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
