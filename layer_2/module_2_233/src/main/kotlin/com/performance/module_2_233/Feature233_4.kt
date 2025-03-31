package com.performance.module_2_233

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_161.Feature161Api
import com.performance.module_1_172.Feature172Api
import com.performance.module_1_171.Feature171Api

class Feature233Repository {
    
        private val api0 = Feature161Api()
        private val api1 = Feature172Api()
        private val api2 = Feature171Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 233"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature233Api {
    suspend fun fetchData(): String {
        return "Data from Feature 233 API"
    }
}
