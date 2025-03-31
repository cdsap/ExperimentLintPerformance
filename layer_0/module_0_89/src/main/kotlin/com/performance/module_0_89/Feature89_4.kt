package com.performance.module_0_89

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature89Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 89"
            
        }
    }
}

class Feature89Api {
    suspend fun fetchData(): String {
        return "Data from Feature 89 API"
    }
}
