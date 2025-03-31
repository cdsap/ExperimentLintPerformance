package com.performance.module_0_86

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature86Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 86"
            
        }
    }
}

class Feature86Api {
    suspend fun fetchData(): String {
        return "Data from Feature 86 API"
    }
}
