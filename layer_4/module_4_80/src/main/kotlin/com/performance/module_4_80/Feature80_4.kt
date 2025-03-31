package com.performance.module_4_80

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_67.Feature67Api
import com.performance.module_3_69.Feature69Api
import com.performance.module_3_61.Feature61Api

class Feature80Repository {
    
        private val api0 = Feature67Api()
        private val api1 = Feature69Api()
        private val api2 = Feature61Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 80"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature80Api {
    suspend fun fetchData(): String {
        return "Data from Feature 80 API"
    }
}
