package com.performance.module_3_61

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature61Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 61"
            
        }
    }
}

class Feature61Api {
    suspend fun fetchData(): String {
        return "Data from Feature 61 API"
    }
}
