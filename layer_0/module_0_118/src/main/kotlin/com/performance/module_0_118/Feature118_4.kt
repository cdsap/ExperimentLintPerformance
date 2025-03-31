package com.performance.module_0_118

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature118Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 118"
            
        }
    }
}

class Feature118Api {
    suspend fun fetchData(): String {
        return "Data from Feature 118 API"
    }
}
