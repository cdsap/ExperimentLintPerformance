package com.performance.module_0_115

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature115Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 115"
            
        }
    }
}

class Feature115Api {
    suspend fun fetchData(): String {
        return "Data from Feature 115 API"
    }
}
