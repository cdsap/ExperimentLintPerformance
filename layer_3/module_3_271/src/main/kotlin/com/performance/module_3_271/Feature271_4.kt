package com.performance.module_3_271

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_232.Feature232Api
import com.performance.module_2_229.Feature229Api
import com.performance.module_2_206.Feature206Api

class Feature271Repository {
    
        private val api0 = Feature232Api()
        private val api1 = Feature229Api()
        private val api2 = Feature206Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 271"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature271Api {
    suspend fun fetchData(): String {
        return "Data from Feature 271 API"
    }
}
