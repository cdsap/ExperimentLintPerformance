package com.performance.module_2_156

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_100.Feature100Api
import com.performance.module_1_116.Feature116Api

class Feature156Repository {
    
        private val api0 = Feature100Api()
        private val api1 = Feature116Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 156"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature156Api {
    suspend fun fetchData(): String {
        return "Data from Feature 156 API"
    }
}
