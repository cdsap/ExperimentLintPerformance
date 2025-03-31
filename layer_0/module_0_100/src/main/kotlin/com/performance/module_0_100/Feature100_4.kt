package com.performance.module_0_100

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature100Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 100"
            
        }
    }
}

class Feature100Api {
    suspend fun fetchData(): String {
        return "Data from Feature 100 API"
    }
}
