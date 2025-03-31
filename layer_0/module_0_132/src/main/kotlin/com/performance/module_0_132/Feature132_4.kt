package com.performance.module_0_132

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature132Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 132"
            
        }
    }
}

class Feature132Api {
    suspend fun fetchData(): String {
        return "Data from Feature 132 API"
    }
}
