package com.performance.module_0_21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature21Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 21"
            
        }
    }
}

class Feature21Api {
    suspend fun fetchData(): String {
        return "Data from Feature 21 API"
    }
}
