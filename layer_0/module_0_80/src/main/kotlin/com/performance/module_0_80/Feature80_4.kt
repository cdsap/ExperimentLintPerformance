package com.performance.module_0_80

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature80Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 80"
            
        }
    }
}

class Feature80Api {
    suspend fun fetchData(): String {
        return "Data from Feature 80 API"
    }
}
