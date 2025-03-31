package com.performance.module_0_108

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature108Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 108"
            
        }
    }
}

class Feature108Api {
    suspend fun fetchData(): String {
        return "Data from Feature 108 API"
    }
}
