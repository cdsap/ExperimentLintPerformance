package com.performance.module_0_88

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature88Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 88"
            
        }
    }
}

class Feature88Api {
    suspend fun fetchData(): String {
        return "Data from Feature 88 API"
    }
}
