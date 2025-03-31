package com.performance.module_0_102

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature102Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 102"
            
        }
    }
}

class Feature102Api {
    suspend fun fetchData(): String {
        return "Data from Feature 102 API"
    }
}
