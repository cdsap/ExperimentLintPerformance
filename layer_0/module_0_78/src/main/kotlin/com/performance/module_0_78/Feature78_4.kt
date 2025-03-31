package com.performance.module_0_78

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature78Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 78"
            
        }
    }
}

class Feature78Api {
    suspend fun fetchData(): String {
        return "Data from Feature 78 API"
    }
}
