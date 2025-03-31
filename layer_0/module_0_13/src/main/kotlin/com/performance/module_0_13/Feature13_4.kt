package com.performance.module_0_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature13Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 13"
            
        }
    }
}

class Feature13Api {
    suspend fun fetchData(): String {
        return "Data from Feature 13 API"
    }
}
