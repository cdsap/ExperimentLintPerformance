package com.performance.module_0_117

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature117Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 117"
            
        }
    }
}

class Feature117Api {
    suspend fun fetchData(): String {
        return "Data from Feature 117 API"
    }
}
