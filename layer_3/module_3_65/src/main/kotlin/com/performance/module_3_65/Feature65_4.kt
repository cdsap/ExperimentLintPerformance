package com.performance.module_3_65

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature65Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 65"
            
        }
    }
}

class Feature65Api {
    suspend fun fetchData(): String {
        return "Data from Feature 65 API"
    }
}
