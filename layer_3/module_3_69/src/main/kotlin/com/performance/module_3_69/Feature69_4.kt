package com.performance.module_3_69

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature69Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 69"
            
        }
    }
}

class Feature69Api {
    suspend fun fetchData(): String {
        return "Data from Feature 69 API"
    }
}
