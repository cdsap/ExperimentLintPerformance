package com.performance.module_0_83

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature83Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 83"
            
        }
    }
}

class Feature83Api {
    suspend fun fetchData(): String {
        return "Data from Feature 83 API"
    }
}
