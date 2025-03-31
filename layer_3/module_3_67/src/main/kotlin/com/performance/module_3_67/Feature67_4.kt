package com.performance.module_3_67

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature67Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 67"
            
        }
    }
}

class Feature67Api {
    suspend fun fetchData(): String {
        return "Data from Feature 67 API"
    }
}
