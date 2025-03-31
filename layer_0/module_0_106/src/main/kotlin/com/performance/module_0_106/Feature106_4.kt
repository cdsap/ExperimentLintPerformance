package com.performance.module_0_106

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature106Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 106"
            
        }
    }
}

class Feature106Api {
    suspend fun fetchData(): String {
        return "Data from Feature 106 API"
    }
}
