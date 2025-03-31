package com.performance.module_0_12

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature12Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 12"
            
        }
    }
}

class Feature12Api {
    suspend fun fetchData(): String {
        return "Data from Feature 12 API"
    }
}
