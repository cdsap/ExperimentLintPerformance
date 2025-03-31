package com.performance.module_0_22

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature22Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 22"
            
        }
    }
}

class Feature22Api {
    suspend fun fetchData(): String {
        return "Data from Feature 22 API"
    }
}
