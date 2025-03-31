package com.performance.module_0_113

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature113Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 113"
            
        }
    }
}

class Feature113Api {
    suspend fun fetchData(): String {
        return "Data from Feature 113 API"
    }
}
