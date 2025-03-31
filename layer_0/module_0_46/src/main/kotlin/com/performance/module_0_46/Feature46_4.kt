package com.performance.module_0_46

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature46Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 46"
            
        }
    }
}

class Feature46Api {
    suspend fun fetchData(): String {
        return "Data from Feature 46 API"
    }
}
