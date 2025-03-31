package com.performance.module_3_262

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature262Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 262"
            
        }
    }
}

class Feature262Api {
    suspend fun fetchData(): String {
        return "Data from Feature 262 API"
    }
}
