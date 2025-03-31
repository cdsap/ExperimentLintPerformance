package com.performance.module_0_76

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature76Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 76"
            
        }
    }
}

class Feature76Api {
    suspend fun fetchData(): String {
        return "Data from Feature 76 API"
    }
}
