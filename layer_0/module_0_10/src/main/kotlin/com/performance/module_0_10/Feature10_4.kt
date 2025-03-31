package com.performance.module_0_10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature10Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 10"
            
        }
    }
}

class Feature10Api {
    suspend fun fetchData(): String {
        return "Data from Feature 10 API"
    }
}
