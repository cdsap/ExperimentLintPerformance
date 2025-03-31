package com.performance.module_0_91

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature91Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 91"
            
        }
    }
}

class Feature91Api {
    suspend fun fetchData(): String {
        return "Data from Feature 91 API"
    }
}
