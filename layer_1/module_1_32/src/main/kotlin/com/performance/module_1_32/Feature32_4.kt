package com.performance.module_1_32

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_8.Feature8Api
import com.performance.module_0_13.Feature13Api
import com.performance.module_0_7.Feature7Api

class Feature32Repository {
    
        private val api0 = Feature6Api()
        private val api1 = Feature8Api()
        private val api2 = Feature13Api()
        private val api3 = Feature7Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 32"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature32Api {
    suspend fun fetchData(): String {
        return "Data from Feature 32 API"
    }
}
