package com.performance.module_0_19

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature19Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 19"
            
        }
    }
}

class Feature19Api {
    suspend fun fetchData(): String {
        return "Data from Feature 19 API"
    }
}
