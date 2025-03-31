package com.performance.module_0_36

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature36Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 36"
            
        }
    }
}

class Feature36Api {
    suspend fun fetchData(): String {
        return "Data from Feature 36 API"
    }
}
