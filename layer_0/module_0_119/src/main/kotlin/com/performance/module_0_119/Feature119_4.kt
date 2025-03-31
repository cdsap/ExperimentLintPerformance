package com.performance.module_0_119

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature119Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 119"
            
        }
    }
}

class Feature119Api {
    suspend fun fetchData(): String {
        return "Data from Feature 119 API"
    }
}
