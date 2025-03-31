package com.performance.module_4_87

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature87Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 87"
            
        }
    }
}

class Feature87Api {
    suspend fun fetchData(): String {
        return "Data from Feature 87 API"
    }
}
