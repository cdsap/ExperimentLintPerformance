package com.performance.module_0_110

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature110Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 110"
            
        }
    }
}

class Feature110Api {
    suspend fun fetchData(): String {
        return "Data from Feature 110 API"
    }
}
