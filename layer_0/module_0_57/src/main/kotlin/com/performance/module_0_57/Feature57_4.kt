package com.performance.module_0_57

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature57Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 57"
            
        }
    }
}

class Feature57Api {
    suspend fun fetchData(): String {
        return "Data from Feature 57 API"
    }
}
