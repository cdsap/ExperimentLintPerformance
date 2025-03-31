package com.performance.module_0_62

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature62Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 62"
            
        }
    }
}

class Feature62Api {
    suspend fun fetchData(): String {
        return "Data from Feature 62 API"
    }
}
