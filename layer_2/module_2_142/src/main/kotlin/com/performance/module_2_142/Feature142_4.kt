package com.performance.module_2_142

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_95.Feature95Api

class Feature142Repository {
    
        private val api0 = Feature95Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 142"
            api0.fetchData()
        }
    }
}

class Feature142Api {
    suspend fun fetchData(): String {
        return "Data from Feature 142 API"
    }
}
