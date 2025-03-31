package com.performance.module_0_7

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature7Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 7"
            
        }
    }
}

class Feature7Api {
    suspend fun fetchData(): String {
        return "Data from Feature 7 API"
    }
}
