package com.performance.module_1_28

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_7.Feature7Api
import com.performance.module_0_9.Feature9Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_14.Feature14Api

class Feature28Repository {
    
        private val api0 = Feature7Api()
        private val api1 = Feature9Api()
        private val api2 = Feature6Api()
        private val api3 = Feature14Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 28"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature28Api {
    suspend fun fetchData(): String {
        return "Data from Feature 28 API"
    }
}
