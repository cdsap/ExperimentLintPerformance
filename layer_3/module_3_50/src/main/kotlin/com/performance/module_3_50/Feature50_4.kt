package com.performance.module_3_50

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature50Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 50"
            
        }
    }
}

class Feature50Api {
    suspend fun fetchData(): String {
        return "Data from Feature 50 API"
    }
}
