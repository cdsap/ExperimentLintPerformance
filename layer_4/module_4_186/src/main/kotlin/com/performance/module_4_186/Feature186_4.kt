package com.performance.module_4_186

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_168.Feature168Api
import com.performance.module_3_176.Feature176Api

class Feature186Repository {
    
        private val api0 = Feature168Api()
        private val api1 = Feature176Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 186"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature186Api {
    suspend fun fetchData(): String {
        return "Data from Feature 186 API"
    }
}
