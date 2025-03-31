package com.performance.module_1_104

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_54.Feature54Api
import com.performance.module_0_70.Feature70Api
import com.performance.module_0_11.Feature11Api

class Feature104Repository {
    
        private val api0 = Feature54Api()
        private val api1 = Feature70Api()
        private val api2 = Feature11Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 104"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature104Api {
    suspend fun fetchData(): String {
        return "Data from Feature 104 API"
    }
}
