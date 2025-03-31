package com.performance.module_2_220

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_174.Feature174Api
import com.performance.module_1_196.Feature196Api
import com.performance.module_1_179.Feature179Api
import com.performance.module_1_144.Feature144Api
import com.performance.module_1_157.Feature157Api
import com.performance.module_1_183.Feature183Api

class Feature220Repository {
    
        private val api0 = Feature174Api()
        private val api1 = Feature196Api()
        private val api2 = Feature179Api()
        private val api3 = Feature144Api()
        private val api4 = Feature157Api()
        private val api5 = Feature183Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 220"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature220Api {
    suspend fun fetchData(): String {
        return "Data from Feature 220 API"
    }
}
