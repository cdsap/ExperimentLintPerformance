package com.performance.module_0_33

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature33Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 33"
            
        }
    }
}

class Feature33Api {
    suspend fun fetchData(): String {
        return "Data from Feature 33 API"
    }
}
