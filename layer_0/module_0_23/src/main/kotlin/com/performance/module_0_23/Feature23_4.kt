package com.performance.module_0_23

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature23Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 23"
            
        }
    }
}

class Feature23Api {
    suspend fun fetchData(): String {
        return "Data from Feature 23 API"
    }
}
