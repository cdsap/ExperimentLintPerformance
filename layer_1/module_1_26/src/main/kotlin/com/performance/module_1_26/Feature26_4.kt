package com.performance.module_1_26

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_13.Feature13Api
import com.performance.module_0_2.Feature2Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_8.Feature8Api

class Feature26Repository {
    
        private val api0 = Feature13Api()
        private val api1 = Feature2Api()
        private val api2 = Feature15Api()
        private val api3 = Feature8Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 26"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature26Api {
    suspend fun fetchData(): String {
        return "Data from Feature 26 API"
    }
}
