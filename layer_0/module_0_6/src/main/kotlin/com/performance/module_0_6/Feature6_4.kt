package com.performance.module_0_6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature6Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 6"
            
        }
    }
}

class Feature6Api {
    suspend fun fetchData(): String {
        return "Data from Feature 6 API"
    }
}
