package com.performance.module_0_29

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature29Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 29"
            
        }
    }
}

class Feature29Api {
    suspend fun fetchData(): String {
        return "Data from Feature 29 API"
    }
}
