package com.performance.module_4_275

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_251.Feature251Api
import com.performance.module_3_270.Feature270Api

class Feature275Repository {
    
        private val api0 = Feature251Api()
        private val api1 = Feature270Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 275"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature275Api {
    suspend fun fetchData(): String {
        return "Data from Feature 275 API"
    }
}
