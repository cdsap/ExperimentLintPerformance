package com.performance.module_1_42

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_4.Feature4Api
import com.performance.module_0_14.Feature14Api
import com.performance.module_0_12.Feature12Api
import com.performance.module_0_13.Feature13Api

class Feature42Repository {
    
        private val api0 = Feature4Api()
        private val api1 = Feature14Api()
        private val api2 = Feature12Api()
        private val api3 = Feature13Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 42"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature42Api {
    suspend fun fetchData(): String {
        return "Data from Feature 42 API"
    }
}
