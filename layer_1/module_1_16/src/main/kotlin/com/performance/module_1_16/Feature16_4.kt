package com.performance.module_1_16

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_10.Feature10Api
import com.performance.module_0_3.Feature3Api
import com.performance.module_0_7.Feature7Api
import com.performance.module_0_11.Feature11Api

class Feature16Repository {
    
        private val api0 = Feature10Api()
        private val api1 = Feature3Api()
        private val api2 = Feature7Api()
        private val api3 = Feature11Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 16"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature16Api {
    suspend fun fetchData(): String {
        return "Data from Feature 16 API"
    }
}
