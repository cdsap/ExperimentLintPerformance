package com.performance.module_0_48

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature48Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 48"
            
        }
    }
}

class Feature48Api {
    suspend fun fetchData(): String {
        return "Data from Feature 48 API"
    }
}
