package com.performance.module_2_159

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_92.Feature92Api
import com.performance.module_1_110.Feature110Api

class Feature159Repository {
    
        private val api0 = Feature92Api()
        private val api1 = Feature110Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 159"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature159Api {
    suspend fun fetchData(): String {
        return "Data from Feature 159 API"
    }
}
