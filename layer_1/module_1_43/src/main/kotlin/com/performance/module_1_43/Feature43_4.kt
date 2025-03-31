package com.performance.module_1_43

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_3.Feature3Api
import com.performance.module_0_13.Feature13Api

class Feature43Repository {
    
        private val api0 = Feature15Api()
        private val api1 = Feature6Api()
        private val api2 = Feature3Api()
        private val api3 = Feature13Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 43"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature43Api {
    suspend fun fetchData(): String {
        return "Data from Feature 43 API"
    }
}
