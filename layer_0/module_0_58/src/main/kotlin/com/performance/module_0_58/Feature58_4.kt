package com.performance.module_0_58

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature58Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 58"
            
        }
    }
}

class Feature58Api {
    suspend fun fetchData(): String {
        return "Data from Feature 58 API"
    }
}
