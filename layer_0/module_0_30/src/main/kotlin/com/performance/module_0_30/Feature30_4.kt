package com.performance.module_0_30

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature30Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 30"
            
        }
    }
}

class Feature30Api {
    suspend fun fetchData(): String {
        return "Data from Feature 30 API"
    }
}
