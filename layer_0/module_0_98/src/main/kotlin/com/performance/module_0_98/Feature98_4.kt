package com.performance.module_0_98

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature98Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 98"
            
        }
    }
}

class Feature98Api {
    suspend fun fetchData(): String {
        return "Data from Feature 98 API"
    }
}
