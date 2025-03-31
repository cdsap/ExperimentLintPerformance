package com.performance.module_4_86

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_67.Feature67Api
import com.performance.module_3_56.Feature56Api
import com.performance.module_3_57.Feature57Api

class Feature86Repository {
    
        private val api0 = Feature67Api()
        private val api1 = Feature56Api()
        private val api2 = Feature57Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 86"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature86Api {
    suspend fun fetchData(): String {
        return "Data from Feature 86 API"
    }
}
