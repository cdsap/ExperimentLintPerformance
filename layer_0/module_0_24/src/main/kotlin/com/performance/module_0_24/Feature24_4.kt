package com.performance.module_0_24

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature24Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 24"
            
        }
    }
}

class Feature24Api {
    suspend fun fetchData(): String {
        return "Data from Feature 24 API"
    }
}
