package com.performance.module_4_277

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_270.Feature270Api
import com.performance.module_3_249.Feature249Api
import com.performance.module_3_268.Feature268Api
import com.performance.module_3_252.Feature252Api

class Feature277Repository {
    
        private val api0 = Feature270Api()
        private val api1 = Feature249Api()
        private val api2 = Feature268Api()
        private val api3 = Feature252Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 277"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature277Api {
    suspend fun fetchData(): String {
        return "Data from Feature 277 API"
    }
}
