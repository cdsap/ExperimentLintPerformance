package com.performance.module_3_168

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature168Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 168"
            
        }
    }
}

class Feature168Api {
    suspend fun fetchData(): String {
        return "Data from Feature 168 API"
    }
}
