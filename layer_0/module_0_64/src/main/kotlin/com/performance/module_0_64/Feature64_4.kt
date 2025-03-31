package com.performance.module_0_64

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature64Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 64"
            
        }
    }
}

class Feature64Api {
    suspend fun fetchData(): String {
        return "Data from Feature 64 API"
    }
}
