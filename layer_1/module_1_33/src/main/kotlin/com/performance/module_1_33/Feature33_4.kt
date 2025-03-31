package com.performance.module_1_33

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_11.Feature11Api
import com.performance.module_0_14.Feature14Api
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_1.Feature1Api

class Feature33Repository {
    
        private val api0 = Feature11Api()
        private val api1 = Feature14Api()
        private val api2 = Feature5Api()
        private val api3 = Feature1Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 33"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature33Api {
    suspend fun fetchData(): String {
        return "Data from Feature 33 API"
    }
}
