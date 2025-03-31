package com.performance.module_0_14

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature14Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 14"
            
        }
    }
}

class Feature14Api {
    suspend fun fetchData(): String {
        return "Data from Feature 14 API"
    }
}
