package com.performance.module_1_21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_1.Feature1Api
import com.performance.module_0_3.Feature3Api
import com.performance.module_0_9.Feature9Api
import com.performance.module_0_2.Feature2Api
import com.performance.module_0_11.Feature11Api
import com.performance.module_0_12.Feature12Api
import com.performance.module_0_7.Feature7Api

class Feature21Repository {
    
        private val api0 = Feature1Api()
        private val api1 = Feature3Api()
        private val api2 = Feature9Api()
        private val api3 = Feature2Api()
        private val api4 = Feature11Api()
        private val api5 = Feature12Api()
        private val api6 = Feature7Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 21"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
            api6.fetchData()
        }
    }
}

class Feature21Api {
    suspend fun fetchData(): String {
        return "Data from Feature 21 API"
    }
}
