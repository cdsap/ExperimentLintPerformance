package com.performance.module_0_11

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature11Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 11"
            
        }
    }
}

class Feature11Api {
    suspend fun fetchData(): String {
        return "Data from Feature 11 API"
    }
}
