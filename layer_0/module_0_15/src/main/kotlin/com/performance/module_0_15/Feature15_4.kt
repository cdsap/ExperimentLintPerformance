package com.performance.module_0_15

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature15Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 15"
            
        }
    }
}

class Feature15Api {
    suspend fun fetchData(): String {
        return "Data from Feature 15 API"
    }
}
