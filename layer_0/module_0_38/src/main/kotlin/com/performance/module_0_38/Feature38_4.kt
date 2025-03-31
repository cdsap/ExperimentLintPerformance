package com.performance.module_0_38

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature38Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 38"
            
        }
    }
}

class Feature38Api {
    suspend fun fetchData(): String {
        return "Data from Feature 38 API"
    }
}
