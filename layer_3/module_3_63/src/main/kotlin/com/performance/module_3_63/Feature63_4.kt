package com.performance.module_3_63

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature63Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 63"
            
        }
    }
}

class Feature63Api {
    suspend fun fetchData(): String {
        return "Data from Feature 63 API"
    }
}
