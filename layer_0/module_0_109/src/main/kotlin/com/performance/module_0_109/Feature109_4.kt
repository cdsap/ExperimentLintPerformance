package com.performance.module_0_109

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature109Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 109"
            
        }
    }
}

class Feature109Api {
    suspend fun fetchData(): String {
        return "Data from Feature 109 API"
    }
}
