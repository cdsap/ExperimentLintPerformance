package com.performance.module_0_128

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature128Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 128"
            
        }
    }
}

class Feature128Api {
    suspend fun fetchData(): String {
        return "Data from Feature 128 API"
    }
}
