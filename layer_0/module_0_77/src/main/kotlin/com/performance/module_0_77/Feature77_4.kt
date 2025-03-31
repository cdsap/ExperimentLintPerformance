package com.performance.module_0_77

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature77Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 77"
            
        }
    }
}

class Feature77Api {
    suspend fun fetchData(): String {
        return "Data from Feature 77 API"
    }
}
