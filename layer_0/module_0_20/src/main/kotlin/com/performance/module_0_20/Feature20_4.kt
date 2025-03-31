package com.performance.module_0_20

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature20Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 20"
            
        }
    }
}

class Feature20Api {
    suspend fun fetchData(): String {
        return "Data from Feature 20 API"
    }
}
