package com.performance.module_0_114

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature114Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 114"
            
        }
    }
}

class Feature114Api {
    suspend fun fetchData(): String {
        return "Data from Feature 114 API"
    }
}
