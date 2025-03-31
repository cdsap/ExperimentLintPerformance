package com.performance.module_1_36

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_8.Feature8Api
import com.performance.module_0_10.Feature10Api

class Feature36Repository {
    
        private val api0 = Feature8Api()
        private val api1 = Feature10Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 36"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature36Api {
    suspend fun fetchData(): String {
        return "Data from Feature 36 API"
    }
}
