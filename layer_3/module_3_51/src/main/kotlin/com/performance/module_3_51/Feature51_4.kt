package com.performance.module_3_51

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature51Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 51"
            
        }
    }
}

class Feature51Api {
    suspend fun fetchData(): String {
        return "Data from Feature 51 API"
    }
}
