package com.performance.module_0_95

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature95Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 95"
            
        }
    }
}

class Feature95Api {
    suspend fun fetchData(): String {
        return "Data from Feature 95 API"
    }
}
