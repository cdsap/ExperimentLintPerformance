package com.performance.module_3_55

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature55Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 55"
            
        }
    }
}

class Feature55Api {
    suspend fun fetchData(): String {
        return "Data from Feature 55 API"
    }
}
