package com.performance.module_0_25

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature25Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 25"
            
        }
    }
}

class Feature25Api {
    suspend fun fetchData(): String {
        return "Data from Feature 25 API"
    }
}
