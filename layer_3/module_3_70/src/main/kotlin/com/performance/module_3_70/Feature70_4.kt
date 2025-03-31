package com.performance.module_3_70

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature70Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 70"
            
        }
    }
}

class Feature70Api {
    suspend fun fetchData(): String {
        return "Data from Feature 70 API"
    }
}
