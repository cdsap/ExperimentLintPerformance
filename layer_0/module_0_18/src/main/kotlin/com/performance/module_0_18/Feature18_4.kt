package com.performance.module_0_18

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature18Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 18"
            
        }
    }
}

class Feature18Api {
    suspend fun fetchData(): String {
        return "Data from Feature 18 API"
    }
}
