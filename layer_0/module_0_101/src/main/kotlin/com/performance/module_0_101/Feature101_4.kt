package com.performance.module_0_101

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature101Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 101"
            
        }
    }
}

class Feature101Api {
    suspend fun fetchData(): String {
        return "Data from Feature 101 API"
    }
}
