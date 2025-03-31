package com.performance.module_1_23

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_13.Feature13Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_5.Feature5Api

class Feature23Repository {
    
        private val api0 = Feature13Api()
        private val api1 = Feature15Api()
        private val api2 = Feature5Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 23"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature23Api {
    suspend fun fetchData(): String {
        return "Data from Feature 23 API"
    }
}
