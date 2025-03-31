package com.performance.module_0_124

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature124Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 124"
            
        }
    }
}

class Feature124Api {
    suspend fun fetchData(): String {
        return "Data from Feature 124 API"
    }
}
