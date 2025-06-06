package com.performance.module_0_121

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature121Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 121"
            
        }
    }
}

class Feature121Api {
    suspend fun fetchData(): String {
        return "Data from Feature 121 API"
    }
}
