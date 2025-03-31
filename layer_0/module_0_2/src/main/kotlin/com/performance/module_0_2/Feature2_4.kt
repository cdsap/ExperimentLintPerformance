package com.performance.module_0_2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature2Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 2"
            
        }
    }
}

class Feature2Api {
    suspend fun fetchData(): String {
        return "Data from Feature 2 API"
    }
}
