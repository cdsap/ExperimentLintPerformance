package com.performance.module_0_81

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature81Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 81"
            
        }
    }
}

class Feature81Api {
    suspend fun fetchData(): String {
        return "Data from Feature 81 API"
    }
}
