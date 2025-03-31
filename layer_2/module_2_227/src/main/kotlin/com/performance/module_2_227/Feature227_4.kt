package com.performance.module_2_227

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_154.Feature154Api
import com.performance.module_1_145.Feature145Api
import com.performance.module_1_174.Feature174Api
import com.performance.module_1_170.Feature170Api
import com.performance.module_1_189.Feature189Api
import com.performance.module_1_172.Feature172Api

class Feature227Repository {
    
        private val api0 = Feature154Api()
        private val api1 = Feature145Api()
        private val api2 = Feature174Api()
        private val api3 = Feature170Api()
        private val api4 = Feature189Api()
        private val api5 = Feature172Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 227"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature227Api {
    suspend fun fetchData(): String {
        return "Data from Feature 227 API"
    }
}
