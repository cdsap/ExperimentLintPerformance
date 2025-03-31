package com.performance.module_3_60

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature60Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 60"
            
        }
    }
}

class Feature60Api {
    suspend fun fetchData(): String {
        return "Data from Feature 60 API"
    }
}
