package com.performance.module_0_1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature1Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 1"
            
        }
    }
}

class Feature1Api {
    suspend fun fetchData(): String {
        return "Data from Feature 1 API"
    }
}
