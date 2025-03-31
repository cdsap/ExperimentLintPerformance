package com.performance.module_4_199

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature199Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 199"
            
        }
    }
}

class Feature199Api {
    suspend fun fetchData(): String {
        return "Data from Feature 199 API"
    }
}
