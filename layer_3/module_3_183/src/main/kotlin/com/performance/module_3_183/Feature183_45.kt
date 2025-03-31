package com.performance.module_3_183

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface Feature183Api1 {
    @GET("endpoint")
    suspend fun getData(): Response<ResponseBody>
}
