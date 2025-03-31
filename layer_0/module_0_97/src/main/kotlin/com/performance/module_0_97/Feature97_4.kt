package com.performance.module_0_97

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature97Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 97"
            
        }
    }
}

class Feature97Api {
    suspend fun fetchData(): String {
        return "Data from Feature 97 API"
    }
}
