package com.performance.module_0_75

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature75Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 75"
            
        }
    }
}

class Feature75Api {
    suspend fun fetchData(): String {
        return "Data from Feature 75 API"
    }
}
