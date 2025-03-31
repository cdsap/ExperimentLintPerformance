package com.performance.module_0_90

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature90Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 90"
            
        }
    }
}

class Feature90Api {
    suspend fun fetchData(): String {
        return "Data from Feature 90 API"
    }
}
