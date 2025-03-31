package com.performance.module_0_74

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature74Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 74"
            
        }
    }
}

class Feature74Api {
    suspend fun fetchData(): String {
        return "Data from Feature 74 API"
    }
}
