package com.performance.module_0_45

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature45Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 45"
            
        }
    }
}

class Feature45Api {
    suspend fun fetchData(): String {
        return "Data from Feature 45 API"
    }
}
