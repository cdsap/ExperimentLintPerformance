package com.performance.module_0_37

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature37Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 37"
            
        }
    }
}

class Feature37Api {
    suspend fun fetchData(): String {
        return "Data from Feature 37 API"
    }
}
