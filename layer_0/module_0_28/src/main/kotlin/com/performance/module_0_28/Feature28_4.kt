package com.performance.module_0_28

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature28Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 28"
            
        }
    }
}

class Feature28Api {
    suspend fun fetchData(): String {
        return "Data from Feature 28 API"
    }
}
