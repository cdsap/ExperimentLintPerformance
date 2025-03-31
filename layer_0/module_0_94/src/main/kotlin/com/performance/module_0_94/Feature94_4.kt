package com.performance.module_0_94

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature94Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 94"
            
        }
    }
}

class Feature94Api {
    suspend fun fetchData(): String {
        return "Data from Feature 94 API"
    }
}
