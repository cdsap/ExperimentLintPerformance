package com.performance.module_1_25

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_1.Feature1Api
import com.performance.module_0_7.Feature7Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_14.Feature14Api

class Feature25Repository {
    
        private val api0 = Feature1Api()
        private val api1 = Feature7Api()
        private val api2 = Feature6Api()
        private val api3 = Feature14Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 25"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature25Api {
    suspend fun fetchData(): String {
        return "Data from Feature 25 API"
    }
}
