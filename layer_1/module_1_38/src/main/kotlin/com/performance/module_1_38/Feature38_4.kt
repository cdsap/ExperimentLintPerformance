package com.performance.module_1_38

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_14.Feature14Api
import com.performance.module_0_7.Feature7Api
import com.performance.module_0_12.Feature12Api
import com.performance.module_0_4.Feature4Api
import com.performance.module_0_1.Feature1Api
import com.performance.module_0_9.Feature9Api

class Feature38Repository {
    
        private val api0 = Feature14Api()
        private val api1 = Feature7Api()
        private val api2 = Feature12Api()
        private val api3 = Feature4Api()
        private val api4 = Feature1Api()
        private val api5 = Feature9Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 38"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature38Api {
    suspend fun fetchData(): String {
        return "Data from Feature 38 API"
    }
}
