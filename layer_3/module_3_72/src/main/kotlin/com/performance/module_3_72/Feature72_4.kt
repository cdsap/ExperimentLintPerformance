package com.performance.module_3_72

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature72Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 72"
            
        }
    }
}

class Feature72Api {
    suspend fun fetchData(): String {
        return "Data from Feature 72 API"
    }
}
