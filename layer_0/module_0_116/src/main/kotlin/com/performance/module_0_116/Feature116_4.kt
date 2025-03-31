package com.performance.module_0_116

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature116Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 116"
            
        }
    }
}

class Feature116Api {
    suspend fun fetchData(): String {
        return "Data from Feature 116 API"
    }
}
