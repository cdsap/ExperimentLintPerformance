package com.performance.module_0_126

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature126Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 126"
            
        }
    }
}

class Feature126Api {
    suspend fun fetchData(): String {
        return "Data from Feature 126 API"
    }
}
