package com.performance.module_0_96

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature96Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 96"
            
        }
    }
}

class Feature96Api {
    suspend fun fetchData(): String {
        return "Data from Feature 96 API"
    }
}
