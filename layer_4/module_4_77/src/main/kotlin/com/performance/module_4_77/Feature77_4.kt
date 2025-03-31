package com.performance.module_4_77

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_50.Feature50Api
import com.performance.module_3_55.Feature55Api
import com.performance.module_3_57.Feature57Api
import com.performance.module_3_72.Feature72Api
import com.performance.module_3_61.Feature61Api

class Feature77Repository {
    
        private val api0 = Feature50Api()
        private val api1 = Feature55Api()
        private val api2 = Feature57Api()
        private val api3 = Feature72Api()
        private val api4 = Feature61Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 77"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature77Api {
    suspend fun fetchData(): String {
        return "Data from Feature 77 API"
    }
}
