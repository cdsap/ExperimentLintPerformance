package com.performance.module_2_213

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_188.Feature188Api

class Feature213Repository {
    
        private val api0 = Feature188Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 213"
            api0.fetchData()
        }
    }
}

class Feature213Api {
    suspend fun fetchData(): String {
        return "Data from Feature 213 API"
    }
}
