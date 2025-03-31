package com.performance.module_0_27

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature27Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 27"
            
        }
    }
}

class Feature27Api {
    suspend fun fetchData(): String {
        return "Data from Feature 27 API"
    }
}
