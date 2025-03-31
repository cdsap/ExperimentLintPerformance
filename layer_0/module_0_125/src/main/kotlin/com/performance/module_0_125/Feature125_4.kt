package com.performance.module_0_125

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature125Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 125"
            
        }
    }
}

class Feature125Api {
    suspend fun fetchData(): String {
        return "Data from Feature 125 API"
    }
}
