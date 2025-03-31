package com.performance.module_0_3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature3Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 3"
            
        }
    }
}

class Feature3Api {
    suspend fun fetchData(): String {
        return "Data from Feature 3 API"
    }
}
