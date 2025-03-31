package com.performance.module_2_141

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_130.Feature130Api
import com.performance.module_1_113.Feature113Api
import com.performance.module_1_90.Feature90Api
import com.performance.module_1_122.Feature122Api

class Feature141Repository {
    
        private val api0 = Feature130Api()
        private val api1 = Feature113Api()
        private val api2 = Feature90Api()
        private val api3 = Feature122Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 141"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature141Api {
    suspend fun fetchData(): String {
        return "Data from Feature 141 API"
    }
}
