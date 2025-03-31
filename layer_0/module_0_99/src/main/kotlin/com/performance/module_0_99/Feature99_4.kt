package com.performance.module_0_99

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature99Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 99"
            
        }
    }
}

class Feature99Api {
    suspend fun fetchData(): String {
        return "Data from Feature 99 API"
    }
}
