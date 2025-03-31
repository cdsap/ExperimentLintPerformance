package com.performance.module_0_130

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature130Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 130"
            
        }
    }
}

class Feature130Api {
    suspend fun fetchData(): String {
        return "Data from Feature 130 API"
    }
}
