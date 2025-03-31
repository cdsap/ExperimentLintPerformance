package com.performance.module_1_144

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_61.Feature61Api
import com.performance.module_0_116.Feature116Api
import com.performance.module_0_127.Feature127Api

class Feature144Repository {
    
        private val api0 = Feature61Api()
        private val api1 = Feature116Api()
        private val api2 = Feature127Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 144"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature144Api {
    suspend fun fetchData(): String {
        return "Data from Feature 144 API"
    }
}
