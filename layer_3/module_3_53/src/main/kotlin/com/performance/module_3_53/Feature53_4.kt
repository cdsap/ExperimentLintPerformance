package com.performance.module_3_53

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature53Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 53"
            
        }
    }
}

class Feature53Api {
    suspend fun fetchData(): String {
        return "Data from Feature 53 API"
    }
}
