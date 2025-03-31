package com.performance.module_0_103

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature103Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 103"
            
        }
    }
}

class Feature103Api {
    suspend fun fetchData(): String {
        return "Data from Feature 103 API"
    }
}
