package com.performance.module_0_44

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature44Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 44"
            
        }
    }
}

class Feature44Api {
    suspend fun fetchData(): String {
        return "Data from Feature 44 API"
    }
}
