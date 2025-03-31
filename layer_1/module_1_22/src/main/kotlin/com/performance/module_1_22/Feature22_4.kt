package com.performance.module_1_22

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_9.Feature9Api

class Feature22Repository {
    
        private val api0 = Feature9Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 22"
            api0.fetchData()
        }
    }
}

class Feature22Api {
    suspend fun fetchData(): String {
        return "Data from Feature 22 API"
    }
}
