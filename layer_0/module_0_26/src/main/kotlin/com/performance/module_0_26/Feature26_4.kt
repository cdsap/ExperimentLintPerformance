package com.performance.module_0_26

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature26Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 26"
            
        }
    }
}

class Feature26Api {
    suspend fun fetchData(): String {
        return "Data from Feature 26 API"
    }
}
