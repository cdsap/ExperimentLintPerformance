package com.performance.module_0_4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature4Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 4"
            
        }
    }
}

class Feature4Api {
    suspend fun fetchData(): String {
        return "Data from Feature 4 API"
    }
}
