package com.performance.module_0_112

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature112Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 112"
            
        }
    }
}

class Feature112Api {
    suspend fun fetchData(): String {
        return "Data from Feature 112 API"
    }
}
