package com.performance.module_1_47

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_4.Feature4Api
import com.performance.module_0_2.Feature2Api
import com.performance.module_0_11.Feature11Api

class Feature47Repository {
    
        private val api0 = Feature4Api()
        private val api1 = Feature2Api()
        private val api2 = Feature11Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 47"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature47Api {
    suspend fun fetchData(): String {
        return "Data from Feature 47 API"
    }
}
