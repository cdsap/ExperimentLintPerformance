package com.performance.module_0_31

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature31Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 31"
            
        }
    }
}

class Feature31Api {
    suspend fun fetchData(): String {
        return "Data from Feature 31 API"
    }
}
