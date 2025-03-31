package com.performance.module_0_107

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature107Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 107"
            
        }
    }
}

class Feature107Api {
    suspend fun fetchData(): String {
        return "Data from Feature 107 API"
    }
}
