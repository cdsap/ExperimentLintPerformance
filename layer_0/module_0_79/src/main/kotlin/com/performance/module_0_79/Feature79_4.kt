package com.performance.module_0_79

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature79Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 79"
            
        }
    }
}

class Feature79Api {
    suspend fun fetchData(): String {
        return "Data from Feature 79 API"
    }
}
