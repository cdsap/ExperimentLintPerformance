package com.performance.module_0_5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature5Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 5"
            
        }
    }
}

class Feature5Api {
    suspend fun fetchData(): String {
        return "Data from Feature 5 API"
    }
}
