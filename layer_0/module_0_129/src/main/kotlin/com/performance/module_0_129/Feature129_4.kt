package com.performance.module_0_129

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature129Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 129"
            
        }
    }
}

class Feature129Api {
    suspend fun fetchData(): String {
        return "Data from Feature 129 API"
    }
}
