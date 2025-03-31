package com.performance.module_4_194

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_176.Feature176Api

class Feature194Repository {
    
        private val api0 = Feature176Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 194"
            api0.fetchData()
        }
    }
}

class Feature194Api {
    suspend fun fetchData(): String {
        return "Data from Feature 194 API"
    }
}
