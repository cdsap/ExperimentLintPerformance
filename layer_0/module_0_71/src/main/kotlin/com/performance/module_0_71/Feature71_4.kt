package com.performance.module_0_71

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature71Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 71"
            
        }
    }
}

class Feature71Api {
    suspend fun fetchData(): String {
        return "Data from Feature 71 API"
    }
}
