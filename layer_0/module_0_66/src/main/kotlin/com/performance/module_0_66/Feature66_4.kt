package com.performance.module_0_66

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature66Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 66"
            
        }
    }
}

class Feature66Api {
    suspend fun fetchData(): String {
        return "Data from Feature 66 API"
    }
}
