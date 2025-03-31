package com.performance.module_0_32

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature32Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 32"
            
        }
    }
}

class Feature32Api {
    suspend fun fetchData(): String {
        return "Data from Feature 32 API"
    }
}
