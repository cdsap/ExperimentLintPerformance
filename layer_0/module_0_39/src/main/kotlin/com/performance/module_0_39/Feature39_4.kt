package com.performance.module_0_39

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature39Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 39"
            
        }
    }
}

class Feature39Api {
    suspend fun fetchData(): String {
        return "Data from Feature 39 API"
    }
}
