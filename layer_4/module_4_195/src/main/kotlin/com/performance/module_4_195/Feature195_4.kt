package com.performance.module_4_195

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_181.Feature181Api

class Feature195Repository {
    
        private val api0 = Feature181Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 195"
            api0.fetchData()
        }
    }
}

class Feature195Api {
    suspend fun fetchData(): String {
        return "Data from Feature 195 API"
    }
}
