package com.performance.module_0_104

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature104Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 104"
            
        }
    }
}

class Feature104Api {
    suspend fun fetchData(): String {
        return "Data from Feature 104 API"
    }
}
