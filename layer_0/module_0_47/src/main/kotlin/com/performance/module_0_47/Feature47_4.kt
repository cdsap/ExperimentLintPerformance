package com.performance.module_0_47

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature47Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 47"
            
        }
    }
}

class Feature47Api {
    suspend fun fetchData(): String {
        return "Data from Feature 47 API"
    }
}
