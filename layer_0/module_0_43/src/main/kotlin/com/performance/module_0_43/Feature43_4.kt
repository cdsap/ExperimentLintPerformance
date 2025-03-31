package com.performance.module_0_43

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature43Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 43"
            
        }
    }
}

class Feature43Api {
    suspend fun fetchData(): String {
        return "Data from Feature 43 API"
    }
}
