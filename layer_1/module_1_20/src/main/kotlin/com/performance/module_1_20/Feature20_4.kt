package com.performance.module_1_20

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_4.Feature4Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_10.Feature10Api

class Feature20Repository {
    
        private val api0 = Feature4Api()
        private val api1 = Feature15Api()
        private val api2 = Feature10Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 20"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature20Api {
    suspend fun fetchData(): String {
        return "Data from Feature 20 API"
    }
}
