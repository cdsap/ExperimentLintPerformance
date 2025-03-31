package com.performance.module_0_93

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature93Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 93"
            
        }
    }
}

class Feature93Api {
    suspend fun fetchData(): String {
        return "Data from Feature 93 API"
    }
}
