package com.performance.module_4_289

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_245.Feature245Api
import com.performance.module_3_268.Feature268Api

class Feature289Repository {
    
        private val api0 = Feature245Api()
        private val api1 = Feature268Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 289"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature289Api {
    suspend fun fetchData(): String {
        return "Data from Feature 289 API"
    }
}
