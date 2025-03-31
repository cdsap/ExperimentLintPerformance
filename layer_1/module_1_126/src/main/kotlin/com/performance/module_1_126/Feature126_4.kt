package com.performance.module_1_126

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_36.Feature36Api

class Feature126Repository {
    
        private val api0 = Feature36Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 126"
            api0.fetchData()
        }
    }
}

class Feature126Api {
    suspend fun fetchData(): String {
        return "Data from Feature 126 API"
    }
}
