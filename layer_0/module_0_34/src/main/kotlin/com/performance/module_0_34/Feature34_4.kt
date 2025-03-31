package com.performance.module_0_34

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature34Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 34"
            
        }
    }
}

class Feature34Api {
    suspend fun fetchData(): String {
        return "Data from Feature 34 API"
    }
}
