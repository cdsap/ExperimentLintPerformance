package com.performance.module_0_9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature9Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 9"
            
        }
    }
}

class Feature9Api {
    suspend fun fetchData(): String {
        return "Data from Feature 9 API"
    }
}
