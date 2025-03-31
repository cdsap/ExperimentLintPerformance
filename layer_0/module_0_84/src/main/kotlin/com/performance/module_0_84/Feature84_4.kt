package com.performance.module_0_84

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature84Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 84"
            
        }
    }
}

class Feature84Api {
    suspend fun fetchData(): String {
        return "Data from Feature 84 API"
    }
}
