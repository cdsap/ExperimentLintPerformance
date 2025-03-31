package com.performance.module_4_294

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_266.Feature266Api
import com.performance.module_3_243.Feature243Api
import com.performance.module_3_244.Feature244Api

class Feature294Repository {
    
        private val api0 = Feature266Api()
        private val api1 = Feature243Api()
        private val api2 = Feature244Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 294"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature294Api {
    suspend fun fetchData(): String {
        return "Data from Feature 294 API"
    }
}
