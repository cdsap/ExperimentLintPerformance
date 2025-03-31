package com.performance.module_3_56

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature56Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 56"
            
        }
    }
}

class Feature56Api {
    suspend fun fetchData(): String {
        return "Data from Feature 56 API"
    }
}
