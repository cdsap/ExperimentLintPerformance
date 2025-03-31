package com.performance.module_2_157

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_113.Feature113Api
import com.performance.module_1_124.Feature124Api
import com.performance.module_1_98.Feature98Api

class Feature157Repository {
    
        private val api0 = Feature113Api()
        private val api1 = Feature124Api()
        private val api2 = Feature98Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 157"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature157Api {
    suspend fun fetchData(): String {
        return "Data from Feature 157 API"
    }
}
