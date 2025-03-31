package com.performance.module_0_8

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature8Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 8"
            
        }
    }
}

class Feature8Api {
    suspend fun fetchData(): String {
        return "Data from Feature 8 API"
    }
}
