package com.performance.module_0_54

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature54Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 54"
            
        }
    }
}

class Feature54Api {
    suspend fun fetchData(): String {
        return "Data from Feature 54 API"
    }
}
