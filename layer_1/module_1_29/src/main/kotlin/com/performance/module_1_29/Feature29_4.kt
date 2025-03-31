package com.performance.module_1_29

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_4.Feature4Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_11.Feature11Api
import com.performance.module_0_14.Feature14Api

class Feature29Repository {
    
        private val api0 = Feature4Api()
        private val api1 = Feature15Api()
        private val api2 = Feature11Api()
        private val api3 = Feature14Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 29"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature29Api {
    suspend fun fetchData(): String {
        return "Data from Feature 29 API"
    }
}
