package com.performance.module_0_105

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature105Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 105"
            
        }
    }
}

class Feature105Api {
    suspend fun fetchData(): String {
        return "Data from Feature 105 API"
    }
}
