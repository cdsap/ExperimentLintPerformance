package com.performance.module_3_249

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_232.Feature232Api
import com.performance.module_2_237.Feature237Api

class Feature249Repository {
    
        private val api0 = Feature232Api()
        private val api1 = Feature237Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 249"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature249Api {
    suspend fun fetchData(): String {
        return "Data from Feature 249 API"
    }
}
