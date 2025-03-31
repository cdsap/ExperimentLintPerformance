package com.performance.module_0_17

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature17Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 17"
            
        }
    }
}

class Feature17Api {
    suspend fun fetchData(): String {
        return "Data from Feature 17 API"
    }
}
