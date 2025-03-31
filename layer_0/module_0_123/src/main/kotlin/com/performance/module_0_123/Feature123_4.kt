package com.performance.module_0_123

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature123Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 123"
            
        }
    }
}

class Feature123Api {
    suspend fun fetchData(): String {
        return "Data from Feature 123 API"
    }
}
