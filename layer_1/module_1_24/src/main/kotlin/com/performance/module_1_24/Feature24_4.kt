package com.performance.module_1_24

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_7.Feature7Api

class Feature24Repository {
    
        private val api0 = Feature7Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 24"
            api0.fetchData()
        }
    }
}

class Feature24Api {
    suspend fun fetchData(): String {
        return "Data from Feature 24 API"
    }
}
