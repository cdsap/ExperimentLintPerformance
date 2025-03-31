package com.performance.module_3_52

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature52Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 52"
            
        }
    }
}

class Feature52Api {
    suspend fun fetchData(): String {
        return "Data from Feature 52 API"
    }
}
