package com.performance.module_3_49

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature49Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 49"
            
        }
    }
}

class Feature49Api {
    suspend fun fetchData(): String {
        return "Data from Feature 49 API"
    }
}
