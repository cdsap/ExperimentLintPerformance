package com.performance.module_0_16

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature16Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 16"
            
        }
    }
}

class Feature16Api {
    suspend fun fetchData(): String {
        return "Data from Feature 16 API"
    }
}
