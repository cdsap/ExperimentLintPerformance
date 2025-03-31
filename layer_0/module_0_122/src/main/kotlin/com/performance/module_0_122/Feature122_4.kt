package com.performance.module_0_122

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature122Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 122"
            
        }
    }
}

class Feature122Api {
    suspend fun fetchData(): String {
        return "Data from Feature 122 API"
    }
}
