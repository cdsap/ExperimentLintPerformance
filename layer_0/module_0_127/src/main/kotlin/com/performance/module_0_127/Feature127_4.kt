package com.performance.module_0_127

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature127Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 127"
            
        }
    }
}

class Feature127Api {
    suspend fun fetchData(): String {
        return "Data from Feature 127 API"
    }
}
