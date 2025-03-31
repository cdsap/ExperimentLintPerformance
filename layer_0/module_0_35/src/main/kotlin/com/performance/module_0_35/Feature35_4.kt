package com.performance.module_0_35

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature35Repository {
    


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 35"
            
        }
    }
}

class Feature35Api {
    suspend fun fetchData(): String {
        return "Data from Feature 35 API"
    }
}
