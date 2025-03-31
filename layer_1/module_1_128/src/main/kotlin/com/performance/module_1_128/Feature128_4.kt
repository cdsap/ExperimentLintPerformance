package com.performance.module_1_128

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_8.Feature8Api
import com.performance.module_0_13.Feature13Api
import com.performance.module_0_82.Feature82Api

class Feature128Repository {
    
        private val api0 = Feature8Api()
        private val api1 = Feature13Api()
        private val api2 = Feature82Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 128"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature128Api {
    suspend fun fetchData(): String {
        return "Data from Feature 128 API"
    }
}
