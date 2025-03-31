package com.performance.module_1_40

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature40Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 40"
            
        }
    }
}

class Feature40Api {
    suspend fun fetchData(): String {
        return "Data from Feature 40 API"
    }
}
