package com.performance.module_3_73

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature73Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 73"
            
        }
    }
}

class Feature73Api {
    suspend fun fetchData(): String {
        return "Data from Feature 73 API"
    }
}
