package com.performance.module_3_68

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature68Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 68"
            
        }
    }
}

class Feature68Api {
    suspend fun fetchData(): String {
        return "Data from Feature 68 API"
    }
}
