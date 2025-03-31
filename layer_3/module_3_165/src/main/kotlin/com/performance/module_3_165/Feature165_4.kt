package com.performance.module_3_165

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_138.Feature138Api

class Feature165Repository {
    
        private val api0 = Feature138Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 165"
            api0.fetchData()
        }
    }
}

class Feature165Api {
    suspend fun fetchData(): String {
        return "Data from Feature 165 API"
    }
}
