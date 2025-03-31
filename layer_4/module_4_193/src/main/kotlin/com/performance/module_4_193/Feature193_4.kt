package com.performance.module_4_193

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature193Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 193"
            
        }
    }
}

class Feature193Api {
    suspend fun fetchData(): String {
        return "Data from Feature 193 API"
    }
}
