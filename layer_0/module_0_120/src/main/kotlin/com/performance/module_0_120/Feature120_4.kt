package com.performance.module_0_120

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature120Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 120"
            
        }
    }
}

class Feature120Api {
    suspend fun fetchData(): String {
        return "Data from Feature 120 API"
    }
}
