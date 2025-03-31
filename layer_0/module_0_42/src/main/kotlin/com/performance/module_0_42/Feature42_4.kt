package com.performance.module_0_42

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature42Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 42"
            
        }
    }
}

class Feature42Api {
    suspend fun fetchData(): String {
        return "Data from Feature 42 API"
    }
}
