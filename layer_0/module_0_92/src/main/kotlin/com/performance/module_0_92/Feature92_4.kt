package com.performance.module_0_92

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature92Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 92"
            
        }
    }
}

class Feature92Api {
    suspend fun fetchData(): String {
        return "Data from Feature 92 API"
    }
}
